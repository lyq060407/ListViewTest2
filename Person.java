package com.microvideo.updata.listviewtest;

/**
 * Created by Administrator on 2017/5/17.
 */

public class Person {
    private String name;
    private int imageId;

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public Person(String name, int imageId) {

        this.name = name;
        this.imageId = imageId;
    }
}
