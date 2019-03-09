package com.rdev.spacexclient.main;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdev.spacexclient.R;
import com.rdev.spacexclient.data.model.Launch;
import com.rdev.spacexclient.data.model.Roadster;

class MainListAdapter extends RecyclerView.Adapter {
    private static final int NEXT_LAUNCH_VIEW_TYPE = 0;
    private static final int TESLA_VIEW_TYPE = 1;
    private Roadster roadster;
    private Launch launch;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == NEXT_LAUNCH_VIEW_TYPE) {
            View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.next_launch_item, viewGroup, false);
            return new NextLaunchHolder(v);
        } else {
            View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.tesla_item, viewGroup, false);
            return new TeslaHolder(v);
        }
    }

    public MainListAdapter() {
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return NEXT_LAUNCH_VIEW_TYPE;
        } else {
            return TESLA_VIEW_TYPE;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof NextLaunchHolder) {
            NextLaunchHolder nextLaunchHolder = ((NextLaunchHolder) viewHolder);
        } else {
            TeslaHolder teslaHolder = ((TeslaHolder) viewHolder);
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public void setRoadster(Roadster roadster) {
        this.roadster = roadster;
        notifyDataSetChanged();
    }

    public void setLaunch(Launch launch) {
        this.launch = launch;
        notifyDataSetChanged();
    }
}
