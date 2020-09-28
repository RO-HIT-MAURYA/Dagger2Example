package com.rohitmaurya.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    @Inject
    Battery battery;
    private Processor processor;

    @Inject
    public Mobile(Processor processor) {
        this.processor = processor;
        Log.e("logIs", "Mobile");
    }

    public void run() {
        Log.e("logIs", "MobileRun");
    }

    // for method injection
    @Inject
    public void ConnectCharge(Charger charger) {
        charger.setCharger();
        Log.e("logIs", "ConnectCharge");
    }
}
