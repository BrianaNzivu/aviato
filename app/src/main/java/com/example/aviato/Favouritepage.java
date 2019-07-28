package com.example.aviato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Favouritepage extends AppCompatActivity {

    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favouritepage);
    }

    public void gotofavourite_example(View view) {
        Intent intent = new Intent(this, favourite_example.class);
        startActivity(intent);
    }
}

