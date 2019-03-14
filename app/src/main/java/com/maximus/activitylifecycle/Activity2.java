package com.maximus.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {
    final String tag2="Activity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d(tag2,"status:onCretae");
    }

    public void gotoactivity1(View view)
    {
        Intent xyz1= new Intent(this,MainActivity.class);
        startActivity(xyz1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag2,"Status: on start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag2,"Status: on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag2,"Status: on destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag2,"Status: on resume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag2,"Status: on restart");
    }

}
