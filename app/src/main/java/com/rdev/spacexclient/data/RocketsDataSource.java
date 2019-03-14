package com.rdev.spacexclient.data;

import com.rdev.spacexclient.data.model.Rocket;

import java.util.ArrayList;
import java.util.List;

public interface RocketsDataSource {
    public interface LoadTasksCallback {

        void onTasksLoaded(ArrayList<Rocket> rockets);

        void onDataNotAvailable();
    }
    public void getRocketsList(LoadTasksCallback callback);
}
