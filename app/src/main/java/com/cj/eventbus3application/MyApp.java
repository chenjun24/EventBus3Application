package com.cj.eventbus3application;

import android.app.Application;

import org.greenrobot.eventbus.EventBus;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.builder().addIndex(new MyEventBusIndex()).installDefaultEventBus();
    }
}
