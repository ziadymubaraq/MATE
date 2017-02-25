package com.ziterz.mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EnterEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enteremail);
    }
    public void openCreateUser (View view){
        Intent i = new Intent(this, CreateUserActivity.class);
        startActivity(i);
    }
}
