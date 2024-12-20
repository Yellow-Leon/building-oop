package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Apartment {
    private String plant;
    private String door;
    private Owner[] owners;

    public Apartment(String plant, String door, Owner[] owners) {
        this.plant = plant;
        this.door = door;
        this.owners = owners;
    }

    public void showInfo (){
        System.out.println("Plant : " + plant + " Door : " + door);
        System.out.print("Owners : ");
        showOwners(owners);
    }

    public void showOwners (Owner[] owners){
        for (Owner owner : owners){
            System.out.println("NIF : " + owner.getNif() + " Name : " + owner.getName() + " Lastname : " + owner.getLastname());
        }
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return Objects.equals(plant, apartment.plant) && Objects.equals(door, apartment.door) && Objects.deepEquals(owners, apartment.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plant, door, Arrays.hashCode(owners));
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "Plant='" + plant + '\'' +
                ", Door='" + door + '\'' +
                ", owners=" + Arrays.toString(owners) +
                '}';
    }
}