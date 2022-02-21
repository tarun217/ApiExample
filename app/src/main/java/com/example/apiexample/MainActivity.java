package com.example.apiexample;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.apiexample.Viewmdels.MostpopularTVShwsViewModel;

public class MainActivity extends AppCompatActivity {

    private MostpopularTVShwsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MostpopularTVShwsViewModel.class);

    }
    private  void  getMostPopularTVShows(){
        viewModel.getMostPopularTVShows(0).observe(this, TvShowsResponse ->
                Toast.makeText(
                        getApplicationContext(),
                        "Total Pahes: " +  TvShowsResponse.getTotalPages(),
                        Toast.LENGTH_SHORT).show()
                );
    }
}