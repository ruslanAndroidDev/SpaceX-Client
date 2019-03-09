package com.rdev.spacexclient.main;

public interface MainContract {
    interface View {
//        void setItemList(ArrayList<Rocket> rockets);
    }

    interface Presenter {
        void onCreate();

        void onItemClick(int position);
    }

    interface Repository {
//        ArrayList<Rocket>getRockets();
    }
}
