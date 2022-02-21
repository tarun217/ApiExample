package com.example.apiexample.responses;

import com.example.apiexample.Models.TvShow;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TvShowsResponse {

    @SerializedName("page")
    private int page;

    @SerializedName("pages")
    private int totalPages;

    @SerializedName("tv_shows")
    private List<TvShow> tvshows;

    public int getPage() {
        return page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<TvShow> getTvshows() {
        return tvshows;
    }
}
