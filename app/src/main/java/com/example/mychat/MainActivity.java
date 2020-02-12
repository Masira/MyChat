package com.example.mychat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity
{
    private Toolbar mToolbar;
    private ViewPager myViewPager;
    private TabLayout myTabLayot;
    private TabsAccessorAdaptor myTabsAccessorAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("MyChat");

        myViewPager = (ViewPager) findViewById(R.id.main_tabs_pager);
        myTabsAccessorAdaptor = new TabsAccessorAdaptor(getSupportFragmentManager());
        myViewPager.setAdapter(myTabsAccessorAdaptor);

        myTabLayot = (TabLayout) findViewById(R.id.main_tabs);
        myTabLayot.setupWithViewPager(myViewPager);

    }
}
