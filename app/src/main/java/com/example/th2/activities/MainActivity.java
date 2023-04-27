package com.example.th2.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.th2.HorizontalFlipTransfromation;
import com.example.th2.R;
import com.example.th2.adapter.AdapterViewPagerTV;
import com.example.th2.adapter.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout navigationView;
    private ViewPager viewPager;
    private FloatingActionButton fab;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        navigationView = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPagertv);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
//                Toast.makeText(MainActivity.this, "Them", Toast.LENGTH_SHORT).show();
            }
        });

        AdapterViewPagerTV adapter = new AdapterViewPagerTV(getSupportFragmentManager(), 3);
        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(true, new HorizontalFlipTransfromation());
        navigationView.setupWithViewPager(viewPager);
//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
////            @Override
////            public void onPageSelected(int position) {
////                switch (position){
////                    case 0: navigationView.getMenu().findItem(R.id.mDanhSach).setChecked(true);
////                        break;
////                    case 1: navigationView.getMenu().findItem(R.id.mThongTin).setChecked(true);
////                        break;
////                    case 2: navigationView.getMenu().findItem(R.id.mTimKiem).setChecked(true);
////                        break;
////                }
////            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });

//        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.mDanhSach: viewPager.setCurrentItem(0);
//                        break;
//                    case R.id.mThongTin: viewPager.setCurrentItem(1);
//                        break;
//                    case R.id.mTimKiem: viewPager.setCurrentItem(2);
//                        break;
//                }
//                return true;
//            }
//        });
    }
}