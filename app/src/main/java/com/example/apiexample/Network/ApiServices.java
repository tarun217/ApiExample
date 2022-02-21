package com.example.apiexample.Network;

import com.example.apiexample.responses.TvShowsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {

    @GET("most-popular")
    Call<TvShowsResponse> getMostPopularTVShows(@Query("page") int page);
}
