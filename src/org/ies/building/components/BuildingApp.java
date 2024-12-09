package org.ies.building.components;

import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingApp {
    Scanner scanner = new Scanner(System.in);
    public void run (Building building){
        int select;
        do {

            System.out.println("1.Muestra toda la informacion del edificio");
            System.out.println("2.Muestra los departamentos de esta planta");
            System.out.println("3.Muestrame este apartamento");
            System.out.println("4.Muestrame los propietarios de esta planta");
            System.out.println("5.Salir");
            select = scanner.nextInt();
            scanner.nextLine();
            if (select == 1){
                building.showInfo();
            } else if (select == 2){
                building.showApartments(building.askPlant());
            } else if (select == 3){
                building.thisApartment(building.askDoor(), building.askPlant());
            } else if (select == 4){
                building.thisOwner(building.askDoor(), building.askPlant());
            } else if (select == 5){
                System.out.println("Saliendo...");
            }
        } while (select !=5);
    }
}
