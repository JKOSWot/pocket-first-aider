package com.example.jake.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AsthmaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma);
    }

    public void GoToAsthmaSymptoms (View v) {
        Intent i = new Intent(AsthmaActivity.this, AsthmaSymptomsActivity.class);
        startActivity(i);
    }
}
