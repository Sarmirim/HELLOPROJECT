package com.example.helloproject;

public class ListItem {
    //Title of library
    private String mNameOfItem;

    //Image (int, String??)
    private int mImageId;

    public ListItem(String vName, int vImageeId)

    {
        mNameOfItem = vName;
        mImageId= vImageeId;
    }

    // Getters
    public String getmNameOfItem() {
        return mNameOfItem;
    }

    public int getmImageId() {
        return mImageId;
    }

}

