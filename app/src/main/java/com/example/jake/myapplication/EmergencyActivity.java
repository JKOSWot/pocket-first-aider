package com.example.jake.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        Button b = (Button)this.findViewById(R.id.callEmergency);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent emCallIntent = new Intent(Intent.ACTION_CALL);
                emCallIntent.setData(Uri.parse("tel:999"));
                //noinspection ResourceType
                startActivity(emCallIntent);
            }
        });

        Button b2 = (Button)this.findViewById(R.id.callNonEmergency);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
        public void onClick(View v) {
                Intent nEmCallIntent = new Intent(Intent.ACTION_CALL);
                nEmCallIntent.setData(Uri.parse("tel:111"));
                //noinspection ResourceType
                startActivity(nEmCallIntent);
            }
        });
    }

}
