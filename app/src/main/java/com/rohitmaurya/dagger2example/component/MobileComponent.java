package com.rohitmaurya.dagger2example.component;

import com.rohitmaurya.dagger2example.model.Mobile;

import dagger.Component;

@Component
public interface MobileComponent
{
    Mobile getMobile();
}
