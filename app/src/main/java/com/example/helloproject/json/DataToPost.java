package com.example.helloproject.json;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class DataToPost {
    private static  Post p;

    DataToPost(JsonObject op){
        p = new Post();
        p.subreddit=op.get("subreddit").toString();
        p.title=op.get("title").toString();
        p.author=op.get("author").toString();
        p.ups=op.get("ups").getAsInt();
        p.num_comments=op.get("num_comments").getAsInt();
        p.permalink=op.get("permalink").toString();
        p.url=op.get("url").toString();
        p.domain=op.get("domain").toString();
        p.id=op.get("id").toString();
        p.printMe();
        //System.out.println(title);
        // System.out.println(ja12.get("author").toString());
        // System.out.println(ja12.get("url").toString());
        //System.out.println(ja12.get("num_comments").toString());
    }

    DataToPost(JsonElement json){

    }

    DataToPost(){

    }

}
