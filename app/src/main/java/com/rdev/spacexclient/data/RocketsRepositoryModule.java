package com.rdev.spacexclient.data;

import com.rdev.spacexclient.common.SpaceXApiService;
import com.rdev.spacexclient.data.remote.RocketsRemoteDataSource;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
abstract public class RocketsRepositoryModule {
    @Singleton
    @Binds
    abstract RocketsDataSource provideTasksLocalDataSource(RocketsRemoteDataSource dataSource);

    @Singleton
    @Provides
    static Retrofit provideRetrofit() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor)
                .build();
        return new Retrofit.Builder().baseUrl("https://api.spacexdata.com/v3/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Singleton
    @Provides
    static SpaceXApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(SpaceXApiService.class);
    }

}
