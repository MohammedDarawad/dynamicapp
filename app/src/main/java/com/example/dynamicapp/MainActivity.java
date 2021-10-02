package com.example.dynamicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.dynamicapp.model.Car;
import com.example.dynamicapp.model.CarModel;

public class MainActivity extends AppCompatActivity {
    EditText etResult;
    Spinner spCarType;
    //Button btShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etResult =  findViewById(R.id.edtResult);
        spCarType = findViewById(R.id.spinner);

        /*btShow = findViewById(R.id.btnShow);

        btShow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                etResult.setText(spCarType.getSelectedItem().toString());
            }
        });*/

    }

    public void click(View view) {
        CarModel cm = new CarModel();
        Car c = cm.getCarByType(spCarType.getSelectedItem().toString());
        if (c != null ){
            etResult.setText(c.getMake());
        }
        else
            etResult.setText("Car Not Found");
    }
}