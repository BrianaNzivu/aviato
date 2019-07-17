package com.example.aviato;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Home extends AppCompatActivity {

    final Fragment fragment1 = new Fragmenthome();
    final Fragment fragment2 = new Search();
    final Fragment fragment3 = new Recents();
    final Fragment fragment4 = new Favourites();
    final Fragment fragment5 = new Account();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fm.beginTransaction().add(R.id.bottom_navigation, fragment5, "3").hide(fragment5).commit();
        fm.beginTransaction().add(R.id.bottom_navigation, fragment4, "2").hide(fragment4).commit();
        fm.beginTransaction().add(R.id.bottom_navigation, fragment3, "3").hide(fragment3).commit();
        fm.beginTransaction().add(R.id.bottom_navigation, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.bottom_navigation,fragment1, "1").commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.setItemTextColor(null);


        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.search:

                                fm.beginTransaction().hide(active).show(fragment2).commit();
                                active = fragment2;
                                return true;

                            case R.id.home:

                                fm.beginTransaction().hide(active).show(fragment1).commit();
                                active = fragment1;
                                return true;


                            case R.id.favourites:

                                fm.beginTransaction().hide(active).show(fragment4).commit();
                                active = fragment4;
                                return true;


                            case R.id.recent:

                                fm.beginTransaction().hide(active).show(fragment3).commit();
                                active = fragment3;
                                return true;


                            case R.id.account:

                                fm.beginTransaction().hide(active).show(fragment5).commit();
                                active = fragment5;
                                return true;



                        }
                        return false;
                    }
                });
    }

    public void setActionBarTitle(String slideshow) {
    }
}
