package org.ies.building.components;

import org.ies.building.model.Owner;

import java.util.Scanner;

public class OwnerReader {
    private final Scanner scanner;

    public OwnerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Owner read (){
        System.out.println("--- Ingresa los datos del dueño ---");
        System.out.println("Ingresa el NIF");
        String nif = scanner.nextLine();
        System.out.println("Ingresa el nombre");
        String name = scanner.nextLine();
        System.out.println("Ingresa el apellido");
        String lastname = scanner.nextLine();

        return new Owner(
                nif,
                name,
                lastname
        );
    }
}
