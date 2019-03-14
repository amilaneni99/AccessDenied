package com.ietevit.accessdenied;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ietevit.accessdenied.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class Sponsors extends AppCompatActivity {
    List<Integer> listimages = new ArrayList<>();
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        actionBar.setTitle("Sponsors");

        initData();

        HorizontalInfiniteCycleViewPager pager = findViewById(R.id.horizontalcycle);
        MyAdapter adapter = new MyAdapter(listimages,getBaseContext());
        pager.setAdapter(adapter);
    }
    private void initData() {
        listimages.add(R.drawable.foxmula);
        listimages.add(R.drawable.markytics);
        listimages.add(R.drawable.github);
        listimages.add(R.drawable.monkey);
        listimages.add(R.drawable.hackerrank);
        listimages.add(R.drawable.hackerearth);
        listimages.add(R.drawable.docker);
        listimages.add(R.drawable.redback);
        listimages.add(R.drawable.mlh);
        listimages.add(R.drawable.digitalocean);
        listimages.add(R.drawable.bugsee);
        listimages.add(R.drawable.estimote);
        listimages.add(R.drawable.balsamiq);
        listimages.add(R.drawable.hasura);
        listimages.add(R.drawable.jet);
        listimages.add(R.drawable.sketch);
        listimages.add(R.drawable.travis);
        listimages.add(R.drawable.stickermule);
        listimages.add(R.drawable.kothari);


    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
