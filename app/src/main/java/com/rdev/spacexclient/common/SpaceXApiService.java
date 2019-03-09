package com.rdev.spacexclient.common;

import com.rdev.spacexclient.data.model.Launch;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SpaceXApiService {
//    @GET("roadster")
//    Call<Tesla> getTeslaRoadster();

    @GET("launches/next")
    Call<Launch> getNextLaunch();
}
