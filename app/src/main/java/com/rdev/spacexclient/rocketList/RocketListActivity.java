package com.rdev.spacexclient.rocketList;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.rdev.spacexclient.R;
import com.rdev.spacexclient.data.model.Rocket;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class RocketListActivity extends AppCompatActivity implements RocketsContract.View {
    RocketsPresenter presenter;
    ViewPager2 viewPager2;
    ImageView planetIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocket_list);
        planetIv = findViewById(R.id.planet_iv);
        Picasso.get().load(R.drawable.earth).fit().into(planetIv);
        presenter = new RocketsPresenter(this);
        viewPager2 = findViewById(R.id.rockets_viewpager);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        presenter.onCreate();
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
                switch (state) {
                    case ViewPager2.SCROLL_STATE_DRAGGING:
                        Log.d("tag", "SCROLL_STATE_DRAGGING");
                        break;
                    case ViewPager2.SCROLL_STATE_IDLE:
                        Log.d("tag", "SCROLL_STATE_IDLE");
                        break;
                    case ViewPager2.SCROLL_STATE_SETTLING:
                        Log.d("tag", "SCROLL_STATE_SETTLING");
                        break;
                }
            }
        });
        
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
