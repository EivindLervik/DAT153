package no.hvl.dat153.oblig1;

import android.media.Image;

/**
 * Created by Eivind on 17.01.2017.
 */

public class Person {

    private String name;
    private Image picture;

    public Person(){
        // Default
    }

    public Person(String name, Image picture){
        this.name = name;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }
}
