package com.example.spinusoidsolutions.spinesolutions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button collectBtn;
    Button analyzeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        collectBtn = (Button) findViewById(R.id.collectButton);
        collectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent collectIntent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(collectIntent);
            }
        });

        analyzeBtn = (Button) findViewById(R.id.analyseButton);
        analyzeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(MainActivity.this, AnalyzeActivity.class);
                startActivity(activityIntent);
            }
        });
    }
}
