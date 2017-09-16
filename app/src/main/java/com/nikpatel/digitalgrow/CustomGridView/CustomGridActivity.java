package com.nikpatel.digitalgrow.CustomGridView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.nikpatel.digitalgrow.R;

import java.util.*;
public class CustomGridActivity extends AppCompatActivity {


    private GridView gridView;
    private CustomGridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = (GridView) findViewById(R.id.gridView);

        adapter = new CustomGridAdapter(this,getItem());

        gridView.setAdapter(adapter);

    }

    private ArrayList getItem(){

        ArrayList<ImageAndText> arrayList = new ArrayList<>();

        ImageAndText addarray = new ImageAndText();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        return arrayList;
    }
}
