package com.example.jake.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AllergiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergies);
    }

    public void GoToSummary (View v) {
        Intent i = new Intent(AllergiesActivity.this, AllergiesActivity.class);
        startActivity(i);
    }

    public void GoToSymptoms (View v) {
        Intent i = new Intent(AllergiesActivity.this, SymptomsActivity.class);
        startActivity(i);
    }


}

