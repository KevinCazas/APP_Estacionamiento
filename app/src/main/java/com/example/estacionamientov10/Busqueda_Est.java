package com.example.estacionamientov10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Busqueda_Est extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMAP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_est);


        // Obtenga el SupportMapFragment y reciba una notificación cuando el mapa esté listo para ser utilizado.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        GoogleMap mMap = googleMap;

        // Añadir un marcador en Sydney y mover la cámara
        LatLng sydney = new LatLng(-16.5, -68.15);
        LatLng sydney01 = new LatLng(-16.2, -68.10);

        mMap.addMarker(new MarkerOptions()
                .position(sydney)
                .title("Estacionaiento multinacinal"));
        mMap.addMarker(new MarkerOptions().position(sydney01).title("estacionamiento car"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}