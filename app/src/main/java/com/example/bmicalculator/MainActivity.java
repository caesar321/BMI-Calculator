package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText weight,Height;
    private TextView Result;
    private ImageView calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight= findViewById(R.id.weight);
        Height= findViewById(R.id.height);
        Result = findViewById(R.id.result);
        calculate= findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(weight.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Your Weight Please", Toast.LENGTH_SHORT).show();
                }
                else if(Height.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Your Height", Toast.LENGTH_SHORT).show();
                }
                else {
                    String myWeight = weight.getText().toString();
                    String myHeight = Height.getText().toString();
                    double hCM= Double.parseDouble(String.valueOf(myHeight));
                    double heightInMetre= hCM/100;
                    double WeightKg= Double.parseDouble(String.valueOf(myWeight));
                    double BMI= (WeightKg/(heightInMetre*heightInMetre));
                    Result.setText( "Your BMI is "+String.valueOf((int) BMI+""));
                }
            }
        });

    }
}