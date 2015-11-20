package com.habuma.spitter.domain;

/**
 * Created by jengowang on 15/11/5.
 */
public class Spittle {
    private Spitter spitter;
    private String text;

    public Spitter getSpitter() {
        return spitter;
    }

    public void setSpitter(Spitter spitter) {
        this.spitter = spitter;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
