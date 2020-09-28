package com.rohitmaurya.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.rohitmaurya.dagger2example.component.DaggerMobileComponent;
import com.rohitmaurya.dagger2example.component.MobileComponent;
import com.rohitmaurya.dagger2example.model.Mobile;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //for field injection field must not be private
    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent mobileComponent = DaggerMobileComponent.create();
        Mobile mobile = mobileComponent.getMobile();
        mobile.run();

        Log.e("LogIs","Testing for field injection");
        mobileComponent.inject(this);

    }
}