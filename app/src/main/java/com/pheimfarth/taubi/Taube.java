package com.pheimfarth.taubi;

import android.location.Location;

public class Taube {

    private String latitude;
    private String longitude;
    private String id;
    private boolean helper;

    public Taube(String id, String latitude, String longitude) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.helper = false;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String distanceBetweenTaubenAddressAndCurrentLocation(double usersLat, double usersLon) {
        Location taubeLocation = new Location("");
        Location usersLocation = new Location("");

        taubeLocation.setLatitude(Double.valueOf(latitude));
        taubeLocation.setLongitude(Double.valueOf(longitude));

        usersLocation.setLatitude(usersLat);
        usersLocation.setLongitude(usersLon);

        float distance = taubeLocation.distanceTo(usersLocation);
        return String.valueOf(distance / 1000) + " km entfernt";
    }

    public String getId() {
        return this.id;
    }

    public boolean getHelper() {
        return this.helper;
    }
}
