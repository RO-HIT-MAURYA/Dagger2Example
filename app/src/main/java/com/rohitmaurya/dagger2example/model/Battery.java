package com.rohitmaurya.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;

public class Battery {
    @Inject
    public Battery() {
        Log.e("logIs", "Battery");
    }
}
