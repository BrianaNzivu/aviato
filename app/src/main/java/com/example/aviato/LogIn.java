package com.example.aviato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

    }
    public void gotohome(View view)
    {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

}

