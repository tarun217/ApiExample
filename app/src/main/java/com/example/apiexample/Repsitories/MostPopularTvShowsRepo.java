package com.example.apiexample.Repsitories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.apiexample.Network.ApiClient;
import com.example.apiexample.Network.ApiServices;
import com.example.apiexample.responses.TvShowsResponse;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MostPopularTvShowsRepo {
    private ApiServices apiServices;

    public MostPopularTvShowsRepo() {
        apiServices = ApiClient.getRetrofit().create(ApiServices.class);

    }
    public LiveData<TvShowsResponse> getMostPopularTVShows(int page) {

        MutableLiveData<TvShowsResponse> data = new MutableLiveData<>();
        apiServices.getMostPopularTVShows(page).enqueue(new Callback<TvShowsResponse>() {
            @Override
            public void onResponse(@NotNull Call<TvShowsResponse> call,@NotNull Response<TvShowsResponse> response) {
             data.setValue(response.body());
            }

            @Override
            public void onFailure(@NotNull Call<TvShowsResponse> call,@NotNull Throwable t) {
             data.setValue(null);
            }
        });
        return data;

    }

}
