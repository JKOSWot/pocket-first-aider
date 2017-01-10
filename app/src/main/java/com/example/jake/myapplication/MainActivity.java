package com.example.jake.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void GoToInstructions (View v) {
        Intent i = new Intent(MainActivity.this, InstructionsActivity.class);
        startActivity(i);
    }

    public void GoToAmenities (View v) {
        Intent i = new Intent(MainActivity.this, AmenitiesActivity.class);
        startActivity(i);
    }

    public void GoToEmergency (View v) {
        Intent i = new Intent(MainActivity.this, EmergencyActivity.class);
        startActivity(i);
    }

    public void GoToTools (View v) {
        Intent i = new Intent(MainActivity.this, ZoomActivity.class);
        startActivity(i);
    }
}
