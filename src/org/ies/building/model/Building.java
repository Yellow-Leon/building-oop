package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Building {
    private String address;
    private String municipality;
    private Apartment[] apartments;

    public Building(String address, String municipality, Apartment[] apartments) {
        this.address = address;
        this.municipality = municipality;
        this.apartments = apartments;
    }

    public String askPlant (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero del piso");
        String plant = scanner.nextLine();
        return plant;
    }

    public String askDoor (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de puertas");
        String door = scanner.nextLine();
        return door;
    }

    public void showInfo() {
        System.out.println("Address: " + address + " Municipality: " + municipality);
        System.out.println("Apartments : ");
        showAll();
    }

    public void showAll() {
        for (Apartment apartment : apartments) {
            System.out.println(apartment);
        }
    }

    public Apartment hasApartment(String plant, String door) {
        for (Apartment apartment : apartments) {
            if (apartment.getDoor().equals(door) && apartment.getPlant().equals(plant)) {
                return apartment;
            }
        }
        return null;
    }

    public void showApartments(String plant) {
        for (Apartment apartment : apartments) {
            if (apartment.getPlant().equals(plant)) {
                System.out.println(apartment);
            }
        }
    }

    public Owner hasOwner(String door, String plant) {
        for (Apartment apartment : apartments) {
            if (apartment.getDoor().equals(door) && apartment.getPlant().equals(plant)) {
                return returnOwners();
            }
        }
        return null;
    }

    public Owner returnOwners() {
        for (Apartment apartment : apartments) {
            for (Owner owner : apartment.getOwners()) {
                return owner;
            }
        }
        return null;
    }

    public void thisApartment(String door, String plant) {
        for (Apartment apartment : apartments) {
            if (apartment.getDoor().equals(door) && apartment.getPlant().equals(plant)) {
                System.out.println(apartment);
                break;
            }
            else {
                System.out.println("No existe ese apartamento");
            }
        }
    }

    public void thisOwner(String door, String plant) {
        for (Apartment apartment : apartments) {
            if (apartment.getDoor().equals(door) && apartment.getPlant().equals(plant)) {
                for (Owner owner: apartment.getOwners()){
                    System.out.println(owner);
                }
                break;
            }
            else {
                System.out.println("No existe ese apartamento");
            }
        }
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
