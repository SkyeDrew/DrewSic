package com.nerdhound.drew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DrewSic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drew_sic);

        BottomNavigationView botNav = findViewById(R.id.bottomnav);
        botNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_carrier, new Home()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment mainFrag = null;
            switch (menuItem.getItemId()) {
                case R.id.navHome:
                    mainFrag = new Home();
                    break;
                case R.id.navSearch:
                    mainFrag = new Search();
                    break;
                case R.id.navDownloads:
                    mainFrag = new Downloads();
                    break;
                case R.id.navMore:
                    mainFrag = new More();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_carrier, mainFrag).commit();

            return true;
        }
    };
}
