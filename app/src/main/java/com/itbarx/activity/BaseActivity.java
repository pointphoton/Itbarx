package com.itbarx.activity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.http.NameValuePair;

import com.itbarx.R;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public abstract class BaseActivity extends ActivityGroup {

	protected abstract int getLayoutResourceId();

	protected abstract Context getContext();

	protected abstract void initViews();

	private ProgressDialog mProgressDialog;

	/** holds the map of callbacks */
	protected HashMap<Integer, ResultCallbackIF> _callbackMap = new HashMap<Integer, ResultCallbackIF>();
	protected HashMap<Integer, Class> _liveChildActivity = new HashMap<Integer, Class>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(getLayoutResourceId());

	initViews();
	}

	@Override
	public void onActivityResult(int correlationId, int resultCode, Intent data) {
	// TODO Auto-generated method stub
	try {
		ResultCallbackIF callback = _callbackMap.get(correlationId);

		switch (resultCode) {
		case Activity.RESULT_CANCELED:
		callback.resultCancel(data);
		_liveChildActivity.remove(correlationId);
		_callbackMap.remove(correlationId);
		break;
		case Activity.RESULT_OK:
		callback.resultOk(data);
		_liveChildActivity.remove(correlationId);
		_callbackMap.remove(correlationId);
		break;
		default:
		writeLog("Base Activity onActivityResult", "correlationId bulunamadı");

		}
	} catch (Exception e) {
		writeLog("Base Activity onActivityResult", "Problem processing result from sub-activity");
	}
	}

	public void showAlert(String msg) {
	final AlertDialog.Builder builder = new AlertDialog.Builder(this);
	builder.setTitle(getResources().getString(R.string.app_name)).setMessage(msg).setCancelable(false).setIcon(android.R.drawable.ic_dialog_alert)
		.setPositiveButton(getString(R.string.Ok), new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int i) {
			dialogInterface.dismiss();
			}
		}).create().show();
	}

	public Dialog showAlert(String msg, String PositiveBtnText, DialogInterface.OnClickListener positiveListener) {

	Dialog dialog = null;
	final AlertDialog.Builder builder = new AlertDialog.Builder(this);
	dialog = builder.setTitle(getResources().getString(R.string.app_name)).setMessage(msg).setCancelable(false).setIcon(android.R.drawable.ic_dialog_alert)
		.setPositiveButton(PositiveBtnText, positiveListener).create();
	return dialog;

	}

	public Dialog showAlert(String msg, String PositiveBtnText, DialogInterface.OnClickListener positiveListener, String NegativeText, DialogInterface.OnClickListener negativeListener) {

	Dialog dialog = null;
	final AlertDialog.Builder builder = new AlertDialog.Builder(this);
	dialog = builder.setTitle(getResources().getString(R.string.app_name)).setMessage(msg).setCancelable(false).setIcon(android.R.drawable.ic_dialog_alert)
		.setNegativeButton(NegativeText, negativeListener).setPositiveButton(PositiveBtnText, positiveListener).create();
	return dialog;

	}

	protected void showToast(String msg) {
	Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
	}

	public void showProgress(String msg) {
	if (mProgressDialog != null && mProgressDialog.isShowing())
		dismissProgress();

	mProgressDialog = ProgressDialog.show(this, getResources().getString(R.string.app_name), msg);
	}

	public void dismissProgress() {
	if (mProgressDialog != null) {
		mProgressDialog.dismiss();
		mProgressDialog = null;
	}
	}

	protected void writeLog(String key, String value) {
	Log.d(key, value);
	}

	public void launchSubActivity(Class subActivityClass) {
	Intent i = new Intent(this, subActivityClass);
	Random rand = new Random();
	int correlationId = rand.nextInt();

	ResultCallbackIF resultCallbackIF = new ResultCallbackIF() {
		@Override
		public void resultOk(Intent data) {
		// TODO Auto-generated method stub
		Log.i("launchSubActivity", "subactivity completed successfully, result=");
		}

		@Override
		public void resultCancel(Intent data) {
		// TODO Auto-generated method stub
		Log.i("launchSubActivity", "subactivity was cancelled, result=");
		}
	};

	_liveChildActivity.put(correlationId, subActivityClass);
	_callbackMap.put(correlationId, resultCallbackIF);
	startActivity(i);
	}

	public void launchSubActivityAddExtra(Class subActivityClass, String key, Serializable serializableObje) {
	Intent i = new Intent(this, subActivityClass);
	i.putExtra(key, serializableObje);
	Random rand = new Random();
	int correlationId = rand.nextInt();

	ResultCallbackIF resultCallbackIF = new ResultCallbackIF() {
		@Override
		public void resultOk(Intent data) {
		// TODO Auto-generated method stub
		Log.i("launchSubActivity", "subactivity completed successfully, result=");
		}

		@Override
		public void resultCancel(Intent data) {
		// TODO Auto-generated method stub
		Log.i("launchSubActivity", "subactivity was cancelled, result=");
		}
	};

	_liveChildActivity.put(correlationId, subActivityClass);
	_callbackMap.put(correlationId, resultCallbackIF);
	startActivity(i);
	}

	public void launchSubActivityAddStringExtra(Class subActivityClass, List<NameValuePair> extraDictionary) {
	Intent i = new Intent(this, subActivityClass);
	for (NameValuePair nameValue : extraDictionary) {
		i.putExtra(nameValue.getName(), nameValue.getValue());
	}

	Random rand = new Random();
	int correlationId = rand.nextInt();

	ResultCallbackIF resultCallbackIF = new ResultCallbackIF() {
		@Override
		public void resultOk(Intent data) {
		// TODO Auto-generated method stub
		Log.i("launchSubActivity", "subactivity completed successfully, result=");
		}

		@Override
		public void resultCancel(Intent data) {
		// TODO Auto-generated method stub
		Log.i("launchSubActivity", "subactivity was cancelled, result=");
		}
	};

	_liveChildActivity.put(correlationId, subActivityClass);
	_callbackMap.put(correlationId, resultCallbackIF);
	startActivity(i);
	}

	public void launchSubActivityForResult(Class subActivityClass, ResultCallbackIF callback) {

	Intent i = new Intent(this, subActivityClass);
	Random rand = new Random();
	int correlationId = rand.nextInt();
	_liveChildActivity.put(correlationId, subActivityClass);
	_callbackMap.put(correlationId, callback);
	startActivityForResult(i, correlationId);

	}

	public void launchSubActivityForResult(Class subActivityClass) {

	Intent i = new Intent(this, subActivityClass);
	Random rand = new Random();
	int correlationId = rand.nextInt();

	ResultCallbackIF resultCallbackIF = new ResultCallbackIF() {
		@Override
		public void resultOk(Intent data) {
		// TODO Auto-generated method stub
		Log.i("launchSubActivity", "subactivity completed successfully, result=");
		}

		@Override
		public void resultCancel(Intent data) {
		// TODO Auto-generated method stub
		Log.i("launchSubActivity", "subactivity was cancelled, result=");
		}
	};

	_liveChildActivity.put(correlationId, subActivityClass);
	_callbackMap.put(correlationId, resultCallbackIF);
	startActivityForResult(i, correlationId);

	}

	public static interface ResultCallbackIF {

	public void resultOk(Intent data);

	public void resultCancel(Intent data);

	}

	public interface ConfigurationChangedListener {
	void ConfigurationChanged(Configuration config);
	}
}
