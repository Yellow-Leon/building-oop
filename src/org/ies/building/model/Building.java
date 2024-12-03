package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String municipality;
    private Apartment[] apartments;

    public Building(String address, String municipality, Apartment[] apartments) {
        this.address = address;
        this.municipality = municipality;
        this.apartments = apartments;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(municipality, building.municipality) && Objects.deepEquals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, municipality, Arrays.hashCode(apartments));
    }

    @Override
    public String toString() {
        return "Building{" +
                "adress='" + address + '\'' +
                ", municipality='" + municipality + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}