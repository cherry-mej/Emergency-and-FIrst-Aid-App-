package com.example.emergencyfirstaidtechnique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    private Button firstAidKit, fever,burns,splinters,sprains,nosebleeds,cuts,bites,poison,stroke,kit,about, emergency_numbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstAidKit = findViewById(R.id.firstAidKitId);
        fever = findViewById(R.id.feverId);
        burns = findViewById(R.id.burnsId);
        splinters = findViewById(R.id.splintersId);
        sprains = findViewById(R.id.sprainsId);
        nosebleeds = findViewById(R.id.nosebleedsId);
        cuts = findViewById(R.id.cutsId);
        bites = findViewById(R.id.bitesId);
        poison = findViewById(R.id.foodPoisonId);
        stroke = findViewById(R.id.strokeId);
        kit = findViewById(R.id.firstAidKitId);
        about = findViewById(R.id.aboutId);
        emergency_numbers = findViewById(R.id.emergencyId);

        firstAidKit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","FirstAidKit");
                startActivity(intent);
            }
        });

        fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","Fever");
                startActivity(intent);


            }
        });

        burns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","Burns");
                startActivity(intent);

            }
        });

        splinters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","Splinters");
                startActivity(intent);


            }
        });

        sprains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","Sprains");
                startActivity(intent);


            }
        });

        nosebleeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","NoseBleeds");
                startActivity(intent);


            }
        });

        cuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","Cuts");
                startActivity(intent);


            }
        });

        bites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","Bites");
                startActivity(intent);


            }
        });

        poison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","Poison");
                startActivity(intent);


            }
        });

        stroke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","Stroke");
                startActivity(intent);


            }
        });

        kit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","Kit");
                startActivity(intent);


            }
        });

        emergency_numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, EmergencyCallActivity.class);
                intent.putExtra("name", "Emergency Call");
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name","About");
                startActivity(intent);


            }
        });
    }
}