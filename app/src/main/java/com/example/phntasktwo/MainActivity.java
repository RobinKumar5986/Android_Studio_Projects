package com.example.phntasktwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int[] birds={R.drawable.egle,R.drawable.flmingo,R.drawable.greycrownedcranes,R.drawable.hummingbird
    ,R.drawable.kingfisher,R.drawable.owl,R.drawable.parrot,R.drawable.peacock,R.drawable.swan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.customList);

        custumBaseAdapter custumBaseAdapter=new custumBaseAdapter(getApplicationContext(),birds);
        listView.setAdapter(custumBaseAdapter);
    }
}