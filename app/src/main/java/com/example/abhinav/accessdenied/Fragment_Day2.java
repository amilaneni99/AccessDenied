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

public class Fragment_Day2 extends Fragment {
    ArrayList<TimelineRow> timelineRowsList2 = new ArrayList<>();
    View view;
    public Fragment_Day2() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.day2_fragment,container,false);

        TimelineRow myRow11 = new TimelineRow(11);
        TimelineRow myRow12 = new TimelineRow(12);
        TimelineRow myRow13 = new TimelineRow(13);
        TimelineRow myRow14 = new TimelineRow(14);
        TimelineRow myRow15 = new TimelineRow(15);
        TimelineRow myRow16 = new TimelineRow(16);
        TimelineRow myRow17 = new TimelineRow(17);
        TimelineRow myRow18 = new TimelineRow(18);
        TimelineRow myRow19 = new TimelineRow(19);


        myRow11.setTitle("Getting Ready for Pitch 3.0");
        myRow11.setDescription("12:00 a.m - 2:00 a.m");
        myRow11.setBellowLineColor(Color.argb(255,0,0,0));
        //myRow11.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow11.setBackgroundSize(60);
        myRow11.setImageSize(60);
        myRow11.setBellowLineSize(6);


        myRow12.setTitle("Refreshments");
        myRow12.setDescription("2:00 a.m - 2:30 a.m");
        //myRow12.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow12.setBellowLineColor(Color.argb(255,0,0,0));
        myRow12.setBellowLineSize(6);
        myRow12.setBackgroundSize(60);
        myRow12.setImageSize(60);

        myRow13.setTitle("Getting Ready for Pitch 3.0");
        myRow13.setDescription("2:30 a.m - 6:30 p.m");
        myRow13.setBellowLineColor(Color.argb(255,0,0,0));
       // myRow13.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow13.setBackgroundSize(60);
        myRow13.setImageSize(60);
        myRow13.setBellowLineSize(6);

        myRow14.setTitle("Pitch 3.0");
        myRow14.setDescription("6:30 a.m - 8:00 a.m");
        myRow14.setBellowLineColor(Color.argb(255,0,0,0));
        //myRow14.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow14.setBackgroundSize(60);
        myRow14.setImageSize(60);
        myRow14.setBellowLineSize(6);

        myRow15.setTitle("Breakfast");
        myRow15.setDescription("8:00 a.m - 9:00 a.m");
        myRow15.setBellowLineColor(Color.argb(255,0,0,0));
       // myRow15.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow15.setBackgroundSize(60);
        myRow15.setImageSize(60);
        myRow15.setBellowLineSize(6);

        myRow16.setTitle("Results 1.0");
        myRow16.setDescription("9:00 a.m - 9:10 a.m");
        myRow16.setBellowLineColor(Color.argb(255,0,0,0));
       // myRow16.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow16.setBackgroundSize(60);
        myRow16.setImageSize(60);
        myRow16.setBellowLineSize(6);

        myRow17.setTitle("Final Pitch of Top 10 Teams");
        myRow17.setDescription("9:10 a.m - 9:40 a.m");
        myRow17.setBellowLineColor(Color.argb(255,0,0,0));
        //myRow17.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow17.setBackgroundSize(60);
        myRow17.setImageSize(60);
        myRow17.setBellowLineSize(6);

        myRow18.setTitle("Results and Prize Distribution");
        myRow18.setDescription("9:40 a.m - 10:30 a.m");
        myRow18.setBellowLineColor(Color.argb(255,0,0,0));
        //myRow18.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow18.setBackgroundSize(60);
        myRow18.setImageSize(60);
        myRow18.setBellowLineSize(6);

        myRow19.setTitle("Closing Ceremony");
        myRow19.setDescription("10:30 p.m - 11:00 p.m");
        myRow19.setBellowLineColor(Color.argb(255,0,0,0));
        //myRow19.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow19.setBackgroundSize(60);
        myRow19.setImageSize(60);
        myRow19.setBellowLineSize(6);

        timelineRowsList2.add(myRow11);
        timelineRowsList2.add(myRow12);
        timelineRowsList2.add(myRow13);
        timelineRowsList2.add(myRow14);
        timelineRowsList2.add(myRow15);
        timelineRowsList2.add(myRow16);
        timelineRowsList2.add(myRow17);
        timelineRowsList2.add(myRow18);
        timelineRowsList2.add(myRow19);

        ArrayAdapter<TimelineRow> myAdapter2 = new TimelineViewAdapter(getContext(),0,timelineRowsList2,false);

        ListView myListView1 = (ListView)view.findViewById(R.id.listView2);
        myListView1.setAdapter(myAdapter2);

        return view;
    }
}
