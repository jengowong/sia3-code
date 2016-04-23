package com.habuma.spitter.domain;

import java.util.Date;

/**
 * 唾沫
 */
public class Spittle {

    private Long id;         //唾沫id
    private Spitter spitter; //吐唾沫的人
    private String text;     //描述
    private Date when;       //时间

    public Spittle() {
        this.spitter = new Spitter();  // HARD-CODED FOR NOW
        this.spitter.setId((long) 1);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getWhen() {
        return this.when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public Spitter getSpitter() {
        return this.spitter;
    }

    public void setSpitter(Spitter spitter) {
        this.spitter = spitter;
    }

}
