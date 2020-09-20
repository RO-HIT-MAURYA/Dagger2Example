package com.rohitmaurya.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;

public class Processor {

    @Inject
    public Processor() {
        Log.e("tagIs", "Processor");
    }
}
