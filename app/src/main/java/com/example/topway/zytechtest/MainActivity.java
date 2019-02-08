package com.example.topway.zytechtest;

import android.content.pm.ActivityInfo;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private FragmentPagerAdapter adapter;
   private ViewPager viewPager;
   private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tablayout);

        FragmentManager fragmentManager=getSupportFragmentManager();

        if (getRequestedOrientation()==ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
            tabLayout.setTabGravity(2);
        }
        adapter=new FragmentPagerAdapter(fragmentManager);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



    }

}
