package com.example.aviato;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;


public class home extends AppCompatActivity
{

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener()

    {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            switch (item.getItemId()) {

                case R.id.home:


                   Fragmenthome home = new Fragmenthome();

                    ft.replace(R.id.container_fragment, home);
                    ft.commit();
                    return true;

                case R.id.account:

                    Account account = new Account();
                    ft.replace(R.id.container_fragment,account);
                    ft.commit();
                    return true;


                case R.id.search:

                    Search search = new Search();
                    ft.replace(R.id.container_fragment, search);
                    ft.commit();
                    return true;

                case R.id.favourites:

                   Favourites favourites = new Favourites();
                    ft.replace(R.id.container_fragment, favourites);
                    ft.commit();
                    return true;

                case R.id.recent:

                    Recents recents = new Recents();
                    ft.replace(R.id.container_fragment, recents);
                    ft.commit();
                    return true;

            }
            return false;
        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        BottomNavigationView navView = findViewById(R.id.nav_view);


        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        Fragmenthome home = new Fragmenthome();
        ft.replace(R.id.container_fragment, home);
        ft.commit();


    }

}