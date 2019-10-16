package com.topupit.asef.autismapp.model;

import android.media.Image;

/**
 * Created by Kishwar on 2/7/2018.
 */

public class SupperTimings {
    int image;
    String title;

    public SupperTimings(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
