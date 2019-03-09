package com.rdev.spacexclient.data;

import com.rdev.spacexclient.data.model.Rocket;
import com.rdev.spacexclient.rocketList.RocketsContract;

import java.util.ArrayList;

public class RocketsRepository implements RocketsContract.Repository {
    RocketsDataSource dataSource;
    ArrayList<Rocket> mCachedRocket;

    public RocketsRepository(RocketsDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void getRockets(RocketsDataSource.LoadTasksCallback callback) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        rockets.add(new Rocket());
        rockets.add(new Rocket());
        rockets.add(new Rocket());
        callback.onTasksLoaded(rockets);
    }
}
