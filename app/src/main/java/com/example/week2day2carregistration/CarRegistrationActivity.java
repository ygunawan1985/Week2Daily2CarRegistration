package com.example.week2day2carregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CarRegistrationActivity extends AppCompatActivity {

    public static final int RESULT_CODE = 999;
    Intent intent;
    EditText etYear, etMake, etModel, etColor, etEngineSize, etTransmissionType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_registration);

        etYear = findViewById(R.id.etYear);
        etMake = findViewById(R.id.etMake);
        etModel = findViewById(R.id.etModel);
        etColor = findViewById(R.id.etColor);
        etEngineSize = findViewById(R.id.etEngineSize);
        etTransmissionType = findViewById(R.id.etTransmissionType);
        intent = getIntent();
    }

    public void onClick(View view) {
        final String year = etYear.getText().toString();
        final String make = etMake.getText().toString();
        final String model = etModel.getText().toString();
        final String color = etColor.getText().toString();
        final String engineSize = etEngineSize.getText().toString();
        final String transmissionType = etTransmissionType.getText().toString();
        final Car aCar = new Car(year, make, model, color, engineSize, transmissionType);

        Bundle carBundle = new Bundle();
        carBundle.putParcelable("car", aCar);
        intent.putExtras(carBundle);
        setResult(RESULT_CODE, intent);
        finish();

    }
}
