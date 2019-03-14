package com.ietevit.accessdenied;

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

import com.ietevit.accessdenied.R;

import org.qap.ctimelineview.TimelineRow;
import org.qap.ctimelineview.TimelineViewAdapter;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

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


        myRow11.setTitle("Breakfast");
        myRow11.setDescription("8:00 a.m - 9:00 a.m");
        myRow11.setBellowLineColor(Color.argb(255,0,0,0));
        //myRow11.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow11.setBackgroundSize(60);
        myRow11.setImageSize(60);
        myRow11.setBellowLineSize(6);


        myRow12.setTitle("Pitch 1.0 (Shortlisting Teams)");
        myRow12.setDescription("10:30 a.m - 11:30 a.m");
        //myRow12.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow12.setBellowLineColor(Color.argb(255,0,0,0));
        myRow12.setBellowLineSize(6);
        myRow12.setBackgroundSize(60);
        myRow12.setImageSize(60);

        myRow13.setTitle("Lunch");
        myRow13.setDescription("12:30 p.m - 1:30 p.m");
        myRow13.setBellowLineColor(Color.argb(255,0,0,0));
       // myRow13.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow13.setBackgroundSize(60);
        myRow13.setImageSize(60);
        myRow13.setBellowLineSize(6);

        myRow14.setTitle("Final Pitch");
        myRow14.setDescription("5:00 p.m - 6:00 p.m");
        myRow14.setBellowLineColor(Color.argb(255,0,0,0));
        //myRow14.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow14.setBackgroundSize(60);
        myRow14.setImageSize(60);
        myRow14.setBellowLineSize(6);

        myRow15.setTitle("Prize Distribution");
        myRow15.setDescription("6:30 p.m - 7:30 p.m");
        myRow15.setBellowLineColor(Color.argb(255,0,0,0));
       // myRow15.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow15.setBackgroundSize(60);
        myRow15.setImageSize(60);
        myRow15.setBellowLineSize(6);


        timelineRowsList2.add(myRow11);
        timelineRowsList2.add(myRow12);
        timelineRowsList2.add(myRow13);
        timelineRowsList2.add(myRow14);
        timelineRowsList2.add(myRow15);


        ArrayAdapter<TimelineRow> myAdapter2 = new TimelineViewAdapter(getContext(),0,timelineRowsList2,false);

        ListView myListView1 = (ListView)view.findViewById(R.id.listView2);
        myListView1.setAdapter(myAdapter2);

        return view;
    }
}
