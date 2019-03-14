package com.rdev.spacexclient;

import com.rdev.spacexclient.data.RocketsRepository;
import com.rdev.spacexclient.di.DaggerAppComponent;

import javax.inject.Inject;

import androidx.annotation.VisibleForTesting;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApplication extends DaggerApplication {
    @Inject
    RocketsRepository rocketsRepository;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
    @VisibleForTesting
    public RocketsRepository getRocketsRepository() {
        return rocketsRepository;
    }
}
