package com.alice.alpaca.uiaanna;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Alice on 15/7/2559.
 */
public class Userlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userlist);
        int[] resId = { R.drawable.sample , R.drawable.sample2, R.drawable.sample3 };

        String[] list = { "Student Innovation Challenge 2016\n25-28July2016 \nat Queen Sirikit National Convention Center", "Other Topic1\nabcd", "Other Topic2\nxyz"};

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);

        ListView listView = (ListView)findViewById(R.id.listview1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
    }

}
