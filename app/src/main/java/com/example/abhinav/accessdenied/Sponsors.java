package com.example.abhinav.accessdenied;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class Sponsors extends AppCompatActivity {
    List<Integer> listimages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);

        initData();

        HorizontalInfiniteCycleViewPager pager = findViewById(R.id.horizontalcycle);
        MyAdapter adapter = new MyAdapter(listimages,getBaseContext());
        pager.setAdapter(adapter);
    }
    private void initData() {
        listimages.add(R.drawable.github);
        listimages.add(R.drawable.hackerrank);
        listimages.add(R.drawable.redback);
        listimages.add(R.drawable.bugsee);
        listimages.add(R.drawable.estimote);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
