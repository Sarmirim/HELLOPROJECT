package com.example.helloproject;

public class ListItem {
    //Title of library
    private String mNameOfItem;

    //Image (int, String??)
    private int mImageId;

    public ListItem(String vName, int vImageId)

    {
        mNameOfItem = vName;
        mImageId = vImageId;
    }

    public ListItem(String vName)

    {
        mNameOfItem = vName;
        mImageId = 0;
    }

    // Getters
    public String getmNameOfItem() {
        return mNameOfItem;
    }

    public int getmImageId() {
        return mImageId;
    }

}

