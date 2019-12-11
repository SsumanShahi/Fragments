package com.suman.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.suman.fragments.fragment.FirstFragment;
import com.suman.fragments.fragment.SecondFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager pageviewer;
    private TabLayout tabid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        pageviewer = findViewById(R.id.pageviewer);
        tabid = findViewById(R.id.tabid);

        tabid.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPageAdaptar viewPageAdaptar = new ViewPageAdaptar(getSupportFragmentManager());
        viewPageAdaptar.addFragment(new FirstFragment(),"Sum");
        viewPageAdaptar.addFragment(new SecondFragment(),"area of circle");

        pageviewer.setAdapter(viewPageAdaptar);
        tabid.setupWithViewPager(pageviewer);
    }
}
