package com.example.helloproject.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class JsonData {
    private static DataToPost transfer;
    public JsonParser jp = new JsonParser();
    public JsonElement root;

    public JsonData() throws IOException {
        String sURL = "https://www.reddit.com/r/russia/.json";

        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.setRequestProperty("User-Agent", "RIFTACH v0.2");
        request.connect();

        root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject rootobj = root.getAsJsonObject();
        JsonElement a = rootobj.get("data");
        fun(a);
        System.out.println(sURL);
    }

    public void fun(JsonElement a)
    {
        System.out.println(a);
    //System.out.println(((JsonObject) a).get("children"));
    JsonElement c = ((JsonObject) a).get("children");
      //  System.out.println(c);
    JsonArray r = c.getAsJsonArray();
    //System.out.println(r);

        cycle(r);

    }

    public void cycle(JsonArray r)
    {
        int lenght = r.size();
        for(int i=0; i<lenght;i++) {
            JsonObject op = r.get(i).getAsJsonObject();
            //System.out.println(op);
            // System.out.println(op.get("data"));


            JsonObject ja12 = op.getAsJsonObject("data");

            JsonElement json = ja12.get("title");
            String title = json.getAsString();
            transfer = new DataToPost(ja12);

            //System.out.println(title);
            String p = ja12.get("url").toString().replace("&amp", "&");
            System.out.println(i);
        }

    }



    String getArrayString(JsonArray array){
        return array.toString();
    }

    String getObjectString(JsonObject object){
        return object.toString();
    }

}
