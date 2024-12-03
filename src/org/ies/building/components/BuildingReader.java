package org.ies.building.components;

import org.ies.building.model.Apartment;
import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;
    private final ApartmentReader apartmentReader;

    public BuildingReader(Scanner scanner, OwnerReader ownerReader, ApartmentReader apartmentReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
        this.apartmentReader = apartmentReader;
    }

    public Building read (){
        System.out.println("--- Introduce los datos del edificio ---");
        System.out.println("Direccion:");
        String address = scanner.nextLine();
        System.out.println("Municipio:");
        String municipio = scanner.nextLine();
        System.out.println("Numero de apartamentos:");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Apartamentos:");
        Apartment[] apartments = new Apartment[size];
        for (int i = 0; i < size; i++) {
            Apartment apartment = apartmentReader.read();
            apartments[i] = apartment;
        }
        return new Building(
                address,
                municipio,
                apartments
        );
    }
}
