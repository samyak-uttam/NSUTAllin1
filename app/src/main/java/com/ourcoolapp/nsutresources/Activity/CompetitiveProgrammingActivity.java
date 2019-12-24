package com.ourcoolapp.nsutresources.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.ourcoolapp.nsutresources.Adapter.CompetitiveViewPagerAdapter;
import com.ourcoolapp.nsutresources.R;
import com.google.android.material.tabs.TabLayout;


public class CompetitiveProgrammingActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private CompetitiveViewPagerAdapter competitiveViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitive_programming);

        Toolbar toolbar = findViewById(R.id.toolbar_competitive);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.view_pager_competitive);
        competitiveViewPagerAdapter = new CompetitiveViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(competitiveViewPagerAdapter);
        tabLayout = findViewById(R.id.tabs_competitive);

        tabLayout.setupWithViewPager(viewPager);
    }

}

