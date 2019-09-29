package com.example.dastantulokulov.m3homework1;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayoutB;
    LinearLayout linearLayoutBT;
    LinearLayout linearLayoutY;
    LinearLayout linearLayoutY2;
    TextView textViewBT;
    TextView textViewCT;
    TextView textViewC;
    TextView textViewTB;
    TextView textViewF;
    TextView textViewF2;
    TextView textViewG;
    TextView textViewG2;
    TextView textViewGr;
    TextView textViewGr2;
    TextView textViewS;
    TextView textViewS2;
    Button buttonDep;
    Button buttonAbr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         buttonDep = findViewById(R.id.dep);
         buttonAbr = findViewById(R.id.abr);

        Button buttonBusiness = findViewById(R.id.businessButton);
        buttonBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dastan", "changed");
                buttonDep.setText("BISH");
                buttonAbr.setText("AlM");
            }
        });

        linearLayoutB = findViewById(R.id.boarding);
        linearLayoutBT = findViewById(R.id.boardingTime);
        textViewBT = findViewById(R.id.bT);
        textViewC = findViewById(R.id.city);
        textViewCT = findViewById(R.id.cityT);
        textViewTB = findViewById(R.id.timeB);

        buttonDep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dastan", "changed");
                linearLayoutB.setBackgroundColor(getResources().getColor(R.color.colorOrange));
                linearLayoutBT.setBackgroundColor(getResources().getColor(R.color.colorOrange));
                textViewBT.setTextColor(getResources().getColor(R.color.colorGreen));
                textViewCT.setTextColor(getResources().getColor(R.color.colorGreen));
                textViewC.setTextColor(getResources().getColor(R.color.colorGreen));
                textViewTB.setTextColor(getResources().getColor(R.color.colorGreen));
            }
        });

        linearLayoutY = findViewById(R.id.YellowInfo);
        linearLayoutY2 = findViewById(R.id.YellowInfo2);
        textViewF = findViewById(R.id.flight);
        textViewG = findViewById(R.id.gate);
        textViewGr = findViewById(R.id.group);
        textViewS = findViewById(R.id.seat);
        textViewF2 = findViewById(R.id.flight1);
        textViewG2 = findViewById(R.id.gate1);
        textViewGr2 = findViewById(R.id.group1);
        textViewS2 = findViewById(R.id.seat1);

        buttonAbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dastan", "changed");
                linearLayoutY.setBackgroundColor(getResources().getColor(R.color.colorDarkGreen));
                linearLayoutY2.setBackgroundColor(getResources().getColor(R.color.colorDarkGreen));
                textViewF.setTextColor(getResources().getColor(R.color.colorWhite));
                textViewG.setTextColor(getResources().getColor(R.color.colorWhite));
                textViewGr.setTextColor(getResources().getColor(R.color.colorWhite));
                textViewS.setTextColor(getResources().getColor(R.color.colorWhite));
                textViewF2.setTextColor(getResources().getColor(R.color.colorWhite));
                textViewG2.setTextColor(getResources().getColor(R.color.colorWhite));
                textViewGr2.setTextColor(getResources().getColor(R.color.colorWhite));
                textViewS2.setTextColor(getResources().getColor(R.color.colorWhite));
            }
        });
    }

}
