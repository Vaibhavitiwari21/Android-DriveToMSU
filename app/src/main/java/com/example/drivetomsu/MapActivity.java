package com.example.drivetomsu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MapActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Action bar custom text display;
        Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        // Connect with activity_main layout;
        setContentView(R.layout.activity_map);

        // Initialized navigation button;
        Button appNavigationButton = findViewById(R.id.MapBtn);
        // SetOnClickListener method for navigation button;
        appNavigationButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        // Sets the end point for navigation searches;
        Uri mapURI = Uri.parse("google.navigation:q=Montclair+State+University,1+Normal+Ave,Montclair,NJ+07043");
        // Intent will request turn-by-turn navigation to Montclair State University;
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,mapURI);
        mapIntent.setPackage("com.google.android.apps.maps");
        //Start the intent;
        startActivity(mapIntent);
    }
}