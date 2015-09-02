package com.itbarx.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.itbarx.common.ServiceErrorModel;
import com.itbarx.utils.DateUtility;

import java.lang.reflect.Type;

/**
 * Created by Photon on 1.09.2015.
 */
public class ErrorMessageParserJSON {

    public String getServiceErrorModelJSONString(ServiceErrorModel serviceErrorModel)
    {
        Gson gson = new GsonBuilder().registerTypeAdapter(ServiceErrorModel.class, new ServiceErrorModelSerializer()).setPrettyPrinting().create();

        return gson.toJson(serviceErrorModel);
    }

    public ServiceErrorModel getServiceErrorModelFromJSON(String jsonString)
    {
        ServiceErrorModel info=null;
        try
        {
            Gson gson = new GsonBuilder().registerTypeAdapter(ServiceErrorModel.class, new ServicePaperDeserializer()).create();
            Type type = new TypeToken<ServiceErrorModel>() {
            }.getType();
            info = gson.fromJson(jsonString, type);

            if(info!= null)
            {
                if(!info.getErrorCode().equalsIgnoreCase("false"))
                {

                    info =null;
                }


            }

        }
        catch(Exception ex)
        {
            info =null;
        }


        return info;
    }

    public class ServiceErrorModelSerializer implements JsonSerializer<ServiceErrorModel> {
        @Override
        public JsonElement serialize(ServiceErrorModel info, Type typeOfSrc, JsonSerializationContext context) {

            JsonObject object = new JsonObject();
            object.addProperty("Result", info.getErrorCode());
            object.addProperty("Message", info.getDescription());
            return object;

        }

    }
    public class ServicePaperDeserializer implements JsonDeserializer<ServiceErrorModel> {

        @Override
        public ServiceErrorModel deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            ServiceErrorModel info = new ServiceErrorModel();

            if(json.getAsJsonObject().get("Result")!=null)
            {
                if(!json.getAsJsonObject().get("Result").isJsonNull())
                    info.setErrorCode(json.getAsJsonObject().get("Result").getAsString());
            }

            if(json.getAsJsonObject().get("Message")!=null)
            {
                if(!json.getAsJsonObject().get("Message").isJsonNull())
                    info.setDescription(json.getAsJsonObject().get("Message").getAsString());
            }

            info.setErrorDate(DateUtility.getNowDate());

            return info;
        }


    }

}
