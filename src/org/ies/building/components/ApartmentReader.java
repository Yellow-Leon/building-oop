package org.ies.building.components;

import org.ies.building.model.Apartment;
import org.ies.building.model.Owner;

import java.util.Scanner;

public class ApartmentReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartmentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartment read (){
        System.out.println("--- Introduce los datos del apartamento");
        System.out.println("Introduce la planta");
        String plant = scanner.nextLine();
        System.out.println("Introduce la puerta");
        String door = scanner.nextLine();
        System.out.println("Cuantos dueños tiene el apartamento");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el dueño");
        Owner[] owners = new Owner[size];
        for (int i = 0; i < size; i++) {
            Owner owner = ownerReader.read();
            owners[i] = owner;
        }

        return new Apartment(
                plant,
                door,
                owners
        );
    }
}
