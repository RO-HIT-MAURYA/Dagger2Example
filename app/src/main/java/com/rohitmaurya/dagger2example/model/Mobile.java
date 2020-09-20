package com.rohitmaurya.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    private Battery battery;
    private Processor processor;

    @Inject
    public Mobile(Battery battery, Processor processor) {
        this.battery = battery;
        this.processor = processor;
        Log.e("logIs", "Mobile");
    }

    public void run() {
        Log.e("logIs", "MobileRun");
    }
}
