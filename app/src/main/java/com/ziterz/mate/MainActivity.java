package com.ziterz.mate;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }

    public void OpenLoginView (View view){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    public void ReminderProject(View view){
        Intent i = new Intent(this, ReminderActivity.class);
        startActivity(i);

    }

}
