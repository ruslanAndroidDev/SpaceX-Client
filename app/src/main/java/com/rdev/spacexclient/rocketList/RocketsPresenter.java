package com.rdev.spacexclient.rocketList;

import android.util.Log;

import com.rdev.spacexclient.data.RocketsDataSource;
import com.rdev.spacexclient.data.RocketsRepository;
import com.rdev.spacexclient.data.model.Rocket;
import com.rdev.spacexclient.di.ActivityScoped;

import java.util.ArrayList;

import javax.inject.Inject;

@ActivityScoped
public class RocketsPresenter implements RocketsContract.Presenter {
    RocketsContract.View view;
    RocketsRepository rocketsRepository;

    @Inject
    public RocketsPresenter(RocketsRepository rocketsRepository) {
        this.rocketsRepository = rocketsRepository;
    }

    public void attachView(RocketsContract.View view) {
        this.view = view;
    }

    @Override
    public void onCreate() {
        rocketsRepository.getRockets(new RocketsDataSource.LoadTasksCallback() {
            @Override
            public void onTasksLoaded(ArrayList<Rocket> rockets) {
                view.setItemList(rockets);
                Log.d("tag", "On Task Loaded in Presenter");
            }

            @Override
            public void onDataNotAvailable() {
                //TODO show error
                Log.d("tag", "onDataNotAvailable in Presenter");
            }
        });
    }

    @Override
    public void onItemClick(int position) {

    }
}
