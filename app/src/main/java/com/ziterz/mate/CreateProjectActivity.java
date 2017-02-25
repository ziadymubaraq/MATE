package com.ziterz.mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
    }
    public void openCreateEmail(View view){
        Intent i = new Intent(this, EnterEmailActivity.class);
        startActivity(i);

    }
}
