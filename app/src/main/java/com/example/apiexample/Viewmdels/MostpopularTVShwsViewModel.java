package com.example.apiexample.Viewmdels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.apiexample.Repsitories.MostPopularTvShowsRepo;
import com.example.apiexample.responses.TvShowsResponse;

public class MostpopularTVShwsViewModel extends ViewModel {
    private MostPopularTvShowsRepo mostPopularTvShowsRepo;
     public  MostpopularTVShwsViewModel(){
         mostPopularTvShowsRepo = new MostPopularTvShowsRepo();


     }

     public LiveData<TvShowsResponse> getMostPopularTVShows(int page){
         return mostPopularTvShowsRepo.getMostPopularTVShows(page);
     }
}
