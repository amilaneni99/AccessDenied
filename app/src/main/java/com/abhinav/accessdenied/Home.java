package com.abhinav.accessdenied;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        dl = (DrawerLayout)findViewById(R.id.home);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Fragment_Day1(),"Day 1");
        adapter.AddFragment(new Fragment_Day2(),"Day 2");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.sponsors)
                    {
                        Intent intent = new Intent(Home.this,Sponsors.class);
                        startActivity(intent);
                        return true;
                    }
                else if(id == R.id.faqs)
                    {
                        Intent intent = new Intent(Home.this,FAQs.class);
                        startActivity(intent);
                        return true;
                    }
                else if(id == R.id.aboutus)
                    {
                        Intent intent = new Intent(Home.this,AboutUs.class);
                        startActivity(intent);
                        return true;
                    }
                else if(id == R.id.contact)
                {
                    Intent intent = new Intent(Home.this,Contact.class);
                    startActivity(intent);
                    return true;
                }
                else if(id == R.id.signout)
                {
                    FirebaseAuth.getInstance().signOut();
                    Intent intent = new Intent(Home.this,LoginActivity.class);
                    startActivity(intent);
                    return true;
                }
                    else {
                    return true;
                }
                }

        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}
