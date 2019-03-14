package com.rdev.spacexclient.data.remote;

import android.util.Log;

import com.rdev.spacexclient.common.SpaceXApiService;
import com.rdev.spacexclient.data.RocketsDataSource;
import com.rdev.spacexclient.data.model.Rocket;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Singleton
public class RocketsRemoteDataSource implements RocketsDataSource {
    SpaceXApiService service;

    @Inject
    public RocketsRemoteDataSource(SpaceXApiService service) {
        this.service = service;
    }

    @Override
    public void getRocketsList(final LoadTasksCallback callback) {
        service.getAllRockets().enqueue(new Callback<ArrayList<Rocket>>() {
            @Override
            public void onResponse(Call<ArrayList<Rocket>> call, Response<ArrayList<Rocket>> response) {
                callback.onTasksLoaded(response.body());
                Log.d("tag", "onDataLoaded drom aApi in DataSource");
            }

            @Override
            public void onFailure(Call<ArrayList<Rocket>> call, Throwable t) {
                callback.onDataNotAvailable();
                Log.d("tag", "onDataNotAvailable drom aApi in DataSource " + t.getMessage());
            }
        });
    }
}
