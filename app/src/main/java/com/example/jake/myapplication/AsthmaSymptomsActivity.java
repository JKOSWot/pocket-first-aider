package com.example.jake.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AsthmaSymptomsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma_symptoms);
    }

    public void GoToAsthmaSummary (View v) {
        Intent i = new Intent(AsthmaSymptomsActivity.this, AsthmaActivity.class);
        startActivity(i);
    }
}
