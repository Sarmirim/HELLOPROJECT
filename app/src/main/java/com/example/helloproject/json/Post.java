package com.example.helloproject.json;

public class Post {
    String subreddit;
    String title;
    String author;
    int ups;
    int num_comments;
    String permalink;
    String url;
    String domain;
    String id;

    String getDetails(){
        String details=author
                +" posted this and got "
                +num_comments
                +" replies";
        return details;
    }

    String getTitle(){
        return title;
    }

    String getScore(){
        return Integer.toString(ups);
    }

    void printLines(){
        System.out.println(subreddit.replace("\"",""));
        System.out.println(title.replace("\"",""));
        System.out.println(author.replace("\"",""));
        System.out.println(permalink.replace("\"",""));
        System.out.println(url.replace("\"",""));
        System.out.println(domain.replace("\"",""));
        System.out.println(id.replace("\"",""));
        System.out.println(ups);
        System.out.println(num_comments);
    }
    void printMe() {
        System.out.println("subreddit: " + subreddit.replace("\"",""));
        System.out.println("title: " + title.replace("\"",""));
        System.out.println("author: " + author.replace("\"",""));
        System.out.println("permalink: " + permalink.replace("\"",""));
        System.out.println("image url: " + url.replace("\"",""));
        System.out.println("domain: " + domain.replace("\"",""));
        System.out.println("id: " + id.replace("\"",""));
        System.out.println("upvotes: " + ups);
        System.out.println("comments: " + num_comments);
    }
}
