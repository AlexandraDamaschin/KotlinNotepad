package com.example.android.kotlin.data;

import android.support.annotation.Nullable;

import java.util.Date;

public class Note {

    //variables needed
    private int id = -1;
    @Nullable
    private String text;
    private boolean isPinned = false;
    private Date createdAt = new Date();
    private Date updatedAt;

    //get id
    public int getId() {
        return id;
    }

    //set id
    public void setId(int id) {
        this.id = id;
    }

    //get and set text
    @Nullable
    public String getText() {
        return text;
    }

    public void setText(@Nullable String text) {
        this.text = text;
    }

    //get and set is pinned
    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    //get and set date
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    //get and set update date
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
