package com.example.nothi.listviewpractice;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView pieListView;
    String[] pies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources =getResources();

        pies = resources.getStringArray(R.array.pie_array);
        //assigns our array of String

        pieListView=(ListView) findViewById(R.id.listView);
        pieListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pies));
        pieListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getApplicationContext(), pies[position], Toast.LENGTH_SHORT).show();
            }

        });


    }
}
