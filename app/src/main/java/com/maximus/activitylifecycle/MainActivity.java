package com.maximus.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    final String tag="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"Status: on create");
    }
    public void gotoactivity2(View view)
    {
        Intent xyz= new Intent(this,Activity2.class);
        startActivity(xyz);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"Status: on start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"Status: on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"Status: on destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"Status: on resume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"Status: on restart");
    }
}
