package com.example.jake.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class InstructionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void GoToAllergiesSummary (View v) {
        Intent i = new Intent(InstructionsActivity.this, AllergiesActivity.class);
        startActivity(i);
    }

    public void GoToAsthmaSummary (View v) {
        Intent i = new Intent(InstructionsActivity.this, AsthmaActivity.class);
        startActivity(i);
    }


}
