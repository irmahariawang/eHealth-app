package com.android.codingmom.ehealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToHome(View v){
        Intent activity = new Intent(this, IsidataActivity.class);
        startActivity(activity);
        finish();
    }

}
