package com.example.week2day2carregistration;

import android.os.Parcel;
import android.os.Parcelable;

public class Car implements Parcelable {
    private String year;
    private String make;
    private String model;
    private String color;
    private String engineSize;
    private String transmissionType;

    public Car() {
    }

    public Car(String year, String make, String model, String color, String engineSize, String transmissionType) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.engineSize = engineSize;
        this.transmissionType = transmissionType;
    }

    protected Car(Parcel in) {
        year = in.readString();
        make = in.readString();
        model = in.readString();
        color = in.readString();
        engineSize = in.readString();
        transmissionType = in.readString();
    }

    public static final Creator<Car> CREATOR = new Creator<Car>() {
        @Override
        public Car createFromParcel(Parcel in) {
            return new Car(in);
        }

        @Override
        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(year);
        parcel.writeString(make);
        parcel.writeString(model);
        parcel.writeString(color);
        parcel.writeString(engineSize);
        parcel.writeString(transmissionType);
    }
}
