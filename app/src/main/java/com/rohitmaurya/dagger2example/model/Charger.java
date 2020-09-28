package com.rohitmaurya.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;

// made for method injection
public class Charger {

    @Inject
    public Charger() {
        {
            Log.e("logIs", "Charger");
        }
    }

    void setCharger() {
        Log.e("logIs", "setCharger");
    }
}
