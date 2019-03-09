package com.rdev.spacexclient.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.rdev.spacexclient.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
        mPresenter.onCreate();
    }


//    @Override
//    public void showText(String text) {
//
//    }
//
//    @Override
//    public void showMainFragment() {
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.add(R.id.container, new MainFragment());
//        ft.commit();
//    }
}
