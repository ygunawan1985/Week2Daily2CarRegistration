package com.example.week2day2carregistration;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE =777;
    TextView tvYear, tvMake, tvModel, tvColor, tvEngineSize, tvTransmissionType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvYear = findViewById(R.id.tvYear);
        tvMake = findViewById(R.id.tvMake);
        tvModel = findViewById(R.id.tvModel);
        tvColor = findViewById(R.id.tvColor);
        tvEngineSize = findViewById(R.id.tvEngineSize);
        tvTransmissionType = findViewById(R.id.tvTransmissionType);
    }

    public void onClick(View view) {
        Intent anIntent = new Intent(this, CarRegistrationActivity.class);
        startActivityForResult(anIntent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data != null){
            Bundle passedBundle = data.getExtras();
            Car passedCar = passedBundle.getParcelable("car");
            displayResultViews();
            tvYear.setText(passedCar.getYear());
            tvMake.setText(passedCar.getMake());
            tvModel.setText(passedCar.getModel());
            tvColor.setText(passedCar.getColor());
            tvEngineSize.setText(passedCar.getEngineSize());
            tvTransmissionType.setText(passedCar.getTransmissionType());
        }

    }



    private void displayResultViews(){
        tvYear.setVisibility(View.VISIBLE);
        tvMake.setVisibility(View.VISIBLE);
        tvModel.setVisibility(View.VISIBLE);
        tvColor.setVisibility(View.VISIBLE);
        tvEngineSize.setVisibility(View.VISIBLE);
        tvTransmissionType.setVisibility(View.VISIBLE);
    }
}
