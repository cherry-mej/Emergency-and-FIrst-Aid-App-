package com.example.emergencyfirstaidtechnique;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmergencyCallActivity extends AppCompatActivity {

    private Button CallAmbulance, CallFireService, CallPolice;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_call);
        CallAmbulance = findViewById(R.id.ambulance);
        CallFireService = findViewById(R.id.fire_service);
        CallPolice = findViewById(R.id.police);

        CallAmbulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:193"));
                startActivity(intent);


            }
        });

        CallFireService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:192"));
                startActivity(intent);


            }
        });

        CallPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:191"));
                startActivity(intent);

            }
        });
    }


}