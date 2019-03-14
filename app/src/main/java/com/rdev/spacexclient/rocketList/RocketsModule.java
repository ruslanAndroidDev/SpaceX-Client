package com.rdev.spacexclient.rocketList;

import com.rdev.spacexclient.di.ActivityScoped;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link }.
 */
@Module
public abstract class RocketsModule {
    @ActivityScoped
    @Binds
    abstract RocketsContract.Presenter rocketPresenter(RocketsPresenter presenter);
}
