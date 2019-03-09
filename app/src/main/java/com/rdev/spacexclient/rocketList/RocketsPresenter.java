package com.rdev.spacexclient.rocketList;

import com.rdev.spacexclient.data.RocketsDataSource;
import com.rdev.spacexclient.data.RocketsRepository;
import com.rdev.spacexclient.data.model.Rocket;

import java.util.ArrayList;

public class RocketsPresenter implements RocketsContract.Presenter {
    RocketsContract.View view;
    RocketsRepository rocketsRepository;

    public RocketsPresenter(RocketsContract.View view) {
        this.view = view;
        rocketsRepository = new RocketsRepository(new RocketsDataSource());
    }

    @Override
    public void onCreate() {
        rocketsRepository.getRockets(new RocketsDataSource.LoadTasksCallback() {
            @Override
            public void onTasksLoaded(ArrayList<Rocket> rockets) {
                view.setItemList(rockets);
            }

            @Override
            public void onDataNotAvailable() {
                //TODO show error
            }
        });
    }

    @Override
    public void onItemClick(int position) {

    }
}
