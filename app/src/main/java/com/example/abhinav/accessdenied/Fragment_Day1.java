package com.example.abhinav.accessdenied;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.qap.ctimelineview.TimelineRow;
import org.qap.ctimelineview.TimelineViewAdapter;

import java.util.ArrayList;

public class Fragment_Day1 extends Fragment {
    ArrayList<TimelineRow> timelineRowsList1 = new ArrayList<>();
    View view;
    public Fragment_Day1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.day1_fragment,container,false);

        TimelineRow myRow = new TimelineRow(0);
        TimelineRow myRow1 = new TimelineRow(1);
        TimelineRow myRow2 = new TimelineRow(2);
        TimelineRow myRow3 = new TimelineRow(3);
        TimelineRow myRow4 = new TimelineRow(4);
        TimelineRow myRow5 = new TimelineRow(5);
        TimelineRow myRow6 = new TimelineRow(6);
        TimelineRow myRow7 = new TimelineRow(7);
        TimelineRow myRow8 = new TimelineRow(8);
        TimelineRow myRow9 = new TimelineRow(9);
        TimelineRow myRow10 = new TimelineRow(10);


        myRow.setTitle("Registration");
        myRow.setDescription("9:00 a.m - 10:00 a.m");
        myRow.setBellowLineColor(Color.argb(255,0,0,0));
        myRow.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow.setBackgroundSize(60);
        myRow.setImageSize(60);
        myRow.setBellowLineSize(6);


        myRow1.setTitle("Inauguration");
        myRow1.setDescription("10:00 a.m - 10:30 a.m");
        myRow1.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow1.setBellowLineColor(Color.argb(255,0,0,0));
        myRow1.setBellowLineSize(6);
        myRow1.setBackgroundSize(60);
        myRow1.setImageSize(60);


        myRow2.setTitle("Pitch 1.0");
        myRow2.setDescription("10:30 a.m - 12:30 p.m");
        myRow2.setBellowLineColor(Color.argb(255,0,0,0));
        myRow2.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow2.setBackgroundSize(60);
        myRow2.setImageSize(60);
        myRow2.setBellowLineSize(6);

        myRow3.setTitle("Lunch Break");
        myRow3.setDescription("12:30 p.m - 2:00 p.m");
        myRow3.setBellowLineColor(Color.argb(255,0,0,0));
        myRow3.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow3.setBackgroundSize(60);
        myRow3.setImageSize(60);
        myRow3.setBellowLineSize(6);

        myRow4.setTitle("Technical Review 1.0");
        myRow4.setDescription("2:00 p.m - 4:00 p.m");
        myRow4.setBellowLineColor(Color.argb(255,0,0,0));
        myRow4.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow4.setBackgroundSize(60);
        myRow4.setImageSize(60);
        myRow4.setBellowLineSize(6);

        myRow5.setTitle("Snacks and Refreshments");
        myRow5.setDescription("4:00 p.m - 5:00 p.m");
        myRow5.setBellowLineColor(Color.argb(255,0,0,0));
        myRow5.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow5.setBackgroundSize(60);
        myRow5.setImageSize(60);
        myRow5.setBellowLineSize(6);

        myRow6.setTitle("Pitch 2.0");
        myRow6.setDescription("5:00 p.m - 7:00 p.m");
        myRow6.setBellowLineColor(Color.argb(255,0,0,0));
        myRow6.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow6.setBackgroundSize(60);
        myRow6.setImageSize(60);
        myRow6.setBellowLineSize(6);

        myRow7.setTitle("Results of Day 1");
        myRow7.setDescription("7:00 p.m - 7:30 p.m");
        myRow7.setBellowLineColor(Color.argb(255,0,0,0));
        myRow7.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow7.setBackgroundSize(60);
        myRow7.setImageSize(60);
        myRow7.setBellowLineSize(6);

        myRow8.setTitle("Technical Review 2.0");
        myRow8.setDescription("7:30 p.m - 8:30 p.m");
        myRow8.setBellowLineColor(Color.argb(255,0,0,0));
        myRow8.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow8.setBackgroundSize(60);
        myRow8.setImageSize(60);
        myRow8.setBellowLineSize(6);

        myRow9.setTitle("Dinner");
        myRow9.setDescription("8:30 p.m - 9:30 p.m");
        myRow9.setBellowLineColor(Color.argb(255,0,0,0));
        myRow9.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow9.setBackgroundSize(60);
        myRow9.setImageSize(60);
        myRow9.setBellowLineSize(6);


        myRow10.setTitle("Technical Review 3.0");
        myRow10.setDescription("9:30 p.m - 12:00 a.m");
        myRow10.setBellowLineColor(Color.argb(255,0,0,0));
        myRow10.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete2));
        myRow10.setBackgroundSize(60);
        myRow10.setImageSize(60);
        myRow10.setBellowLineSize(6);


        timelineRowsList1.add(myRow);
        timelineRowsList1.add(myRow1);
        timelineRowsList1.add(myRow2);
        timelineRowsList1.add(myRow3);
        timelineRowsList1.add(myRow4);
        timelineRowsList1.add(myRow5);
        timelineRowsList1.add(myRow6);
        timelineRowsList1.add(myRow7);
        timelineRowsList1.add(myRow8);
        timelineRowsList1.add(myRow9);
        timelineRowsList1.add(myRow10);


        ArrayAdapter<TimelineRow> myAdapter1 = new TimelineViewAdapter(getContext(),0,timelineRowsList1,false);

        ListView myListView = (ListView)view.findViewById(R.id.listView1);
        myListView.setAdapter(myAdapter1);

        return view;
    }
}
