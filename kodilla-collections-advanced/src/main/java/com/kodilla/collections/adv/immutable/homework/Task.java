package com.kodilla.collections.adv.immutable.homework;

public class Task {
    protected final String title;
    protected final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    /* public void setTitle(String title) { //proba utworzenia settera
        this.title = title;
    } */

    public int getDuration() {
        return duration;
    }
}
