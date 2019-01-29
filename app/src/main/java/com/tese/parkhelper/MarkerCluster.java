package com.tese.parkhelper;

import android.media.Image;

import com.google.android.gms.maps.model.LatLng;

public class MarkerCluster implements ClusterItem {

    private LatLng position;
    private String title;
    private String snippet;
    private Image image;


    public MarkerCluster(LatLng position, String title, String snippet, Image image) {
        this.position = position;
        this.title = title;
        this.snippet = snippet;
        this.image = image;
    }

    public MarkerCluster() {

    }

    public LatLng getPosition() {
        return position;
    }

    public void setPosition(LatLng position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
