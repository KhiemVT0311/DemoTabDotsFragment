package com.eup.dotsfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.eup.dotsfragment.adapter.NewsPagerAdapter;
import com.eup.dotsfragment.fragment.FavoriteFragment;
import com.eup.dotsfragment.fragment.NewsFragment;
import com.eup.dotsfragment.fragment.SavedFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager pager;
    private TabLayout tab;
    private NewsPagerAdapter adapter;

    private NewsFragment fmNews = new NewsFragment();
    private SavedFragment fmSaved = new SavedFragment();
    private FavoriteFragment fmFavorite = new FavoriteFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        pager = findViewById(R.id.viewPager);
        tab = findViewById(R.id.tabLayout);
        tab.setupWithViewPager(pager);
        adapter = new NewsPagerAdapter(getSupportFragmentManager(), fmNews, fmSaved, fmFavorite);
        pager.setAdapter(adapter);
        pager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Log.e(getClass().getName(), position + "");
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}