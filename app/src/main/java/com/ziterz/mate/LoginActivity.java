package com.ziterz.mate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }
    public void CloseLoginView (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void OpenChat (View view){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
    public void ForgotToast(View view) {
        Toast.makeText(view.getContext(),
                "Check your Email!", Toast.LENGTH_SHORT).show();
    }
}
