package com.ziterz.mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().hide();
    }
    public void openMainview (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
    public void openCreateP (View view){
        Intent i = new Intent(this, CreateProjectActivity.class);
        startActivity(i);
    }
}
