package com.rdev.spacexclient.data;

import com.rdev.spacexclient.data.model.Rocket;
import com.rdev.spacexclient.rocketList.RocketsContract;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RocketsRepository implements RocketsContract.Repository {
    RocketsDataSource dataSource;
    ArrayList<Rocket> mCachedRocket;

    @Inject
    public RocketsRepository(RocketsDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void getRockets(final RocketsDataSource.LoadTasksCallback callback) {
        dataSource.getRocketsList(new RocketsDataSource.LoadTasksCallback() {
            @Override
            public void onTasksLoaded(ArrayList<Rocket> rockets) {
                mCachedRocket = rockets;
                callback.onTasksLoaded(rockets);
            }

            @Override
            public void onDataNotAvailable() {
                callback.onDataNotAvailable();
            }
        });
    }
}
