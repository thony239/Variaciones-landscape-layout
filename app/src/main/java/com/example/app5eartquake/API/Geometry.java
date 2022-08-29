package com.example.app5eartquake.API;

public class Geometry {
    private double [] coordinates;
    public double getLongitude(){
        return coordinates[0];
    }
    public double getLatitude(){
        return coordinates[1];
    }
}
