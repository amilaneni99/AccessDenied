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


        myRow.setTitle("Registration and Inaguration Ceremony");
        myRow.setDescription("8:00 a.m - 9:00 a.m");
        myRow.setBellowLineColor(Color.argb(255,0,0,0));
 //       myRow.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow.setBackgroundSize(60);
        myRow.setImageSize(60);
        myRow.setBellowLineSize(6);


        myRow1.setTitle("Component Distribution");
        myRow1.setDescription("9:00 a.m - 9:30 a.m");
   //     myRow1.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow1.setBellowLineColor(Color.argb(255,0,0,0));
        myRow1.setBellowLineSize(6);
        myRow1.setBackgroundSize(60);
        myRow1.setImageSize(60);


        myRow2.setTitle("Lunch");
        myRow2.setDescription("12:30 a.m - 1:30 p.m");
        myRow2.setBellowLineColor(Color.argb(255,0,0,0));
     //   myRow2.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow2.setBackgroundSize(60);
        myRow2.setImageSize(60);
        myRow2.setBellowLineSize(6);

        myRow3.setTitle("Snacks");
        myRow3.setDescription("5:00 p.m");
        myRow3.setBellowLineColor(Color.argb(255,0,0,0));
       // myRow3.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow3.setBackgroundSize(60);
        myRow3.setImageSize(60);
        myRow3.setBellowLineSize(6);

        myRow4.setTitle("Technical Review 1.0");
        myRow4.setDescription("6:30 p.m - 8:00 p.m");
        myRow4.setBellowLineColor(Color.argb(255,0,0,0));
//        myRow4.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow4.setBackgroundSize(60);
        myRow4.setImageSize(60);
        myRow4.setBellowLineSize(6);

        myRow5.setTitle("Dinner");
        myRow5.setDescription("8:00 p.m");
        myRow5.setBellowLineColor(Color.argb(255,0,0,0));
  //      myRow5.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow5.setBackgroundSize(60);
        myRow5.setImageSize(60);
        myRow5.setBellowLineSize(6);

        myRow6.setTitle("Refreshments Break");
        myRow6.setDescription("11:30 p.m");
        myRow6.setBellowLineColor(Color.argb(255,0,0,0));
    //    myRow6.setImage(BitmapFactory.decodeResource(getResources(),R.drawable.iete));
        myRow6.setBackgroundSize(60);
        myRow6.setImageSize(60);
        myRow6.setBellowLineSize(6);



        timelineRowsList1.add(myRow);
        timelineRowsList1.add(myRow1);
        timelineRowsList1.add(myRow2);
        timelineRowsList1.add(myRow3);
        timelineRowsList1.add(myRow4);
        timelineRowsList1.add(myRow5);
        timelineRowsList1.add(myRow6);



        ArrayAdapter<TimelineRow> myAdapter1 = new TimelineViewAdapter(getContext(),0,timelineRowsList1,false);

        ListView myListView = (ListView)view.findViewById(R.id.listView1);
        myListView.setAdapter(myAdapter1);

        return view;
    }
}
