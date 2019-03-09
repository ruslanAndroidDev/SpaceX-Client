package com.rdev.spacexclient.main;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdev.spacexclient.R;
import com.rdev.spacexclient.common.SpaceXApiService;

import retrofit2.Retrofit;

public class MainFragment extends Fragment {
    RecyclerView mainRecyclerView;
    Retrofit retrofit;
    SpaceXApiService service;
    MainListAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.main_fragment, container, false);
        mainRecyclerView = v.findViewById(R.id.mainRv);
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new MainListAdapter();
        mainRecyclerView.setAdapter(adapter);
        return v;
    }
}
