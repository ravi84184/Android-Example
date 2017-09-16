package com.nikpatel.digitalgrow.RecyclerViewDemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.nikpatel.digitalgrow.R;
import com.nikpatel.digitalgrow.RecyclerViewDemo.adapter.RecyclerAdapter;
import com.nikpatel.digitalgrow.RecyclerViewDemo.model.RecycleModel;

import java.util.*;
public class RecycleViewDemo extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_demo);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);

        adapter = new RecyclerAdapter(getItem());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }
    private ArrayList getItem(){

        ArrayList<RecycleModel> arrayList = new ArrayList<>();

        RecycleModel addarray = new RecycleModel();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        return arrayList;
    }

}
