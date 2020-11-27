package com.example.project5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Moma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geWebsite(View view)
    {
        startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse("http://rutgers.edu")));
    }
}