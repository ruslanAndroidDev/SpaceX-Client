package com.rdev.spacexclient.rocketList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdev.spacexclient.R;
import com.rdev.spacexclient.data.model.Rocket;

import java.util.ArrayList;

class RocketDataAdapter extends RecyclerView.Adapter<RocketDataAdapter.RocketHolder> {
    ArrayList<Rocket> data;

    public RocketDataAdapter(ArrayList<Rocket> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public RocketHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new RocketHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rocket_info_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RocketHolder rocketHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class RocketHolder extends RecyclerView.ViewHolder {

        public RocketHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
