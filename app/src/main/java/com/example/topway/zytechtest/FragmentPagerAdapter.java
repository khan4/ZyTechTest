package com.example.topway.zytechtest;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {

    String[] names={"Daily","Hourly","Map","News"};
    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;

        switch (i){
            case 0:
                fragment=FragmentDaily.getInstance();
                break;
            case 1:
                fragment=FragmentHourly.getInstance();
                break;
            case 2:
                fragment=FragmentMap.getInstance();
                break;
            case 3:
                fragment=FragmentNews.getInstance();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }
}
