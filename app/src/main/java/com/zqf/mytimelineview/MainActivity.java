package com.zqf.mytimelineview;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.qap.ctimelineview.TimelineRow;
import org.qap.ctimelineview.TimelineViewAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView timeline_listView;
    private List<Bean> list;
    ArrayAdapter<TimelineRow> myAdapter;
    private ArrayList<TimelineRow> timelineRowsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        list = new ArrayList<>();
        Bean bean;
        for (int i = 0; i < 5; i++) {
            bean=new Bean("date"+i,"title"+i,"description"+i);
            list.add(bean);
            timelineRowsList.add(createRandomTimelineRow(i));
        }
        //Create the Timeline Adapter
        myAdapter = new TimelineViewAdapter(this, 0, timelineRowsList,
                //if true, list will be sorted by date
                false);
        timeline_listView.setAdapter(myAdapter);
    }

    private void initView() {
        timeline_listView = (ListView) findViewById(R.id.timeline_listView);
    }

    //Method to create new Timeline Row
    private TimelineRow createRandomTimelineRow(int id) {

        Bean bean = list.get(id);
        // Create new timeline row (pass your Id)
        TimelineRow myRow = new TimelineRow(id);

        //to set the row Date (optional)
        myRow.setDate(null);
        //to set the row Title (optional)
        myRow.setTitle(bean.getTitle());
        //to set the row Description (optional)
        myRow.setDescription(bean.getDescription());
        //to set the row bitmap image (optional)
        if(id==4){
            myRow.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.img_9));
        }
        //to set row Below Line Color (optional)
        myRow.setBellowLineColor(R.color.colorAccent);
        //to set row Below Line Size in dp (optional)
        myRow.setBellowLineSize(5);
        //to set row Image Size in dp (optional)
        myRow.setImageSize(30);
        //to set background color of the row image (optional)
        myRow.setBackgroundColor(R.color.colorAccent2);
        //to set the Background Size of the row image in dp (optional)
        myRow.setBackgroundSize(20);
        //to set row Date text color (optional)
//        myRow.setDateColor(getRandomColor());
        //to set row Title text color (optional)
//        myRow.setTitleColor(getRandomColor());
        //to set row Description text color (optional)
//        myRow.setDescriptionColor(getRandomColor());

        return myRow;
    }
}
