package com.rohitmaurya.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rohitmaurya.dagger2example.component.DaggerMobileComponent;
import com.rohitmaurya.dagger2example.component.MobileComponent;
import com.rohitmaurya.dagger2example.model.Mobile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent mobileComponent = DaggerMobileComponent.create();
        Mobile mobile = mobileComponent.getMobile();
        mobile.run();
    }
}