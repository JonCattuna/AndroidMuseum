package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.button);
        result = findViewById(R.id.result);d*/
    }



    public void addition(View view)
    {
        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        result.setText(String.valueOf(sum));
    }







    /*public void geWebsite(View view)
    {
        startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse("http://rutgers.edu")));
    }*/
}