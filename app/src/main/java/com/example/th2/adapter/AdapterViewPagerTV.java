package com.example.th2.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.th2.fragment.FragmentDS;
import com.example.th2.fragment.FragmentTK;
import com.example.th2.fragment.FragmentTT;

public class AdapterViewPagerTV extends FragmentPagerAdapter {
    private int numPage;
    public AdapterViewPagerTV(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        numPage = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentDS();
            case 1: return new FragmentTT();
            case 2: return new FragmentTK();
        }
        return new FragmentDS();
    }

    @Override
    public int getCount() {
        return numPage;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Danh sách";
            case 1: return "Thông tin";
            case 2: return "Tìm kiếm & thống kê";
        }
        return "Danh sách";
    }
}
