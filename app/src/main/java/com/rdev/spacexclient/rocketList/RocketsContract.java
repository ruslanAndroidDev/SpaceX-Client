package com.rdev.spacexclient.rocketList;

import com.rdev.spacexclient.data.RocketsDataSource;
import com.rdev.spacexclient.data.model.Rocket;

import java.util.ArrayList;

public interface RocketsContract {
    interface View {
        void setItemList(ArrayList<Rocket> rockets);

        void setBackgroundImage(int resId);

        void setMessageText(String message);
    }

    interface Presenter {
        void onCreate();

        void onItemClick(int position);

    }

    interface Repository {
        void getRockets(RocketsDataSource.LoadTasksCallback callback);
    }

}
