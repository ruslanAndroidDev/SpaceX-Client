package com.rdev.spacexclient.rocketList;

import android.os.Bundle;
import android.widget.ImageView;

import com.rdev.spacexclient.R;
import com.rdev.spacexclient.data.model.Rocket;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import javax.inject.Inject;

import androidx.viewpager2.widget.ViewPager2;
import dagger.android.support.DaggerAppCompatActivity;

public class RocketListActivity extends DaggerAppCompatActivity implements RocketsContract.View {
    @Inject
    RocketsPresenter presenter;

    ViewPager2 viewPager2;
    ImageView planetIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocket_list);
        presenter.attachView(this);
        planetIv = findViewById(R.id.planet_iv);
        Picasso.get().load(R.drawable.earth).fit().into(planetIv);
        viewPager2 = findViewById(R.id.rockets_viewpager);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        presenter.onCreate();

    }

    @Override
    public void setItemList(ArrayList<Rocket> rockets) {
        RocketDataAdapter adapter = new RocketDataAdapter(rockets);
        viewPager2.setAdapter(adapter);
    }

    @Override
    public void setBackgroundImage(int resId) {

    }

    @Override
    public void setMessageText(String message) {

    }
}
