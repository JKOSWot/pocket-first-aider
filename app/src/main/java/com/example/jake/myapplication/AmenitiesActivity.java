package com.example.jake.myapplication;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class AmenitiesActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenities);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng yorkHospital = new LatLng(53.9691120, -1.0817450);
        mMap.addMarker(new MarkerOptions().position(yorkHospital).title("York Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yorkHospital));

        LatLng yorkPharmacy = new LatLng(53.9640643, -1.0840496);
        mMap.addMarker(new MarkerOptions().position(yorkPharmacy).title("Cohens Pharmacy"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yorkPharmacy));

        LatLng yorkPharmacy2 = new LatLng(53.9625234,-1.0784988);
        mMap.addMarker(new MarkerOptions().position(yorkPharmacy2).title("Monkbar Pharmacy"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yorkPharmacy2));

        LatLng yorkSurgery = new LatLng(53.9639144, -1.0763893);
        mMap.addMarker(new MarkerOptions().position(yorkSurgery).title("Minster Health Group"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yorkSurgery));

        LatLng yorkSurgery2 = new LatLng(53.9600278,-1.0762605);
        mMap.addMarker(new MarkerOptions().position(yorkSurgery2).title("Jorvik Practise"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yorkSurgery2));

    }
}
