import org.ies.building.components.ApartmentReader;
import org.ies.building.components.BuildingApp;
import org.ies.building.components.BuildingReader;
import org.ies.building.components.OwnerReader;
import org.ies.building.model.Apartment;
import org.ies.building.model.Building;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OwnerReader ownerReader = new OwnerReader(scanner);
        ApartmentReader apartmentReader = new ApartmentReader(scanner, ownerReader);
        BuildingReader buildingReader = new BuildingReader(scanner, ownerReader,apartmentReader);
        BuildingApp buildingApp = new BuildingApp();

        Building building = buildingReader.read();
        buildingApp.run(building);
    }
}