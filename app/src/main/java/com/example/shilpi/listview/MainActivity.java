package com.example.shilpi.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener{

    ListView lst;
    String [] Days = {" Monday", " Tuesday"," Wednesday"," Thursday"," Friday"," Saturday"," Sunday"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst =(ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Days);
        lst.setAdapter(arrayAdapter);
        lst.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView tv = (TextView) view;
        Toast toast = Toast.makeText(this, "YOU CLICKED ON" + tv.getText() + i, Toast.LENGTH_SHORT);
        toast.show();

    }
