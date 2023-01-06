package com.example.luccodeliveryandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        showHome();
        bottomNavigationView= findViewById(R.id.bottomNav);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navhome:
                    showHome();
                    bottomNavigationView.getMenu().findItem(R.id.navhome).setChecked(true);
                    break;

                case R.id.navuser:
                    showUser();
                    bottomNavigationView.getMenu().findItem(R.id.navuser).setChecked(true);
                    break;
            }
            return false;
        });
    }



        public void showHome(){
            FragmentManager fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragmentContainerView2,Main.class,null).setReorderingAllowed(true).addToBackStack("home").commit();

        }
        public void showUser(){
            FragmentManager fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragmentContainerView2,Profile.class,null).setReorderingAllowed(true).addToBackStack("user").commit();

        }
    }