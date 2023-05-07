package org.kinto2517;

import org.kinto2517.Classes.Home;
import org.kinto2517.Classes.House;
import org.kinto2517.Classes.VacationHome;
import org.kinto2517.Classes.Villa;
import org.kinto2517.Services.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();

        Home home1 = new Home(100, 1000000, 3, 1);
        Home home2 = new Home(200, 1000000, 3, 2);
        Home home3 = new Home(300, 1000000, 4, 0);

        Villa villa1 = new Villa(130, 2000000, 3, 1);
        Villa villa2 = new Villa(230, 2000000, 4, 2);
        Villa villa3 = new Villa(420, 2000000, 5, 3);

        VacationHome vacationHome1 = new VacationHome(350, 3000000, 3, 1);
        VacationHome vacationHome2 = new VacationHome(400, 3000000, 4, 2);
        VacationHome vacationHome3 = new VacationHome(300, 3000000, 5, 3);

        houseService.addHouse(villa1);
        houseService.addHouse(villa2);
        houseService.addHouse(villa3);

        houseService.addHouse(vacationHome1);
        houseService.addHouse(vacationHome2);
        houseService.addHouse(vacationHome3);

        houseService.addHouse(home1);
        houseService.addHouse(home2);
        houseService.addHouse(home3);

        System.out.println("\nTotal price of all villas: " + houseService.getTotalPriceOfVilla());
        System.out.println("Total price of all vacation homes: " + houseService.getTotalPriceOfVacationHome());
        System.out.println("Total price of all homes: " + houseService.getTotalPriceOfHome());
        System.out.println("Total price of all houses: " + houseService.getTotalPriceOfAllHouses());

        System.out.println("\nAverage square meters of all villas: " + houseService.getTotalSquareMetersOfVilla());
        System.out.println("Average square meters of all vacation homes: " + houseService.getTotalSquareMetersOfVacationHome());
        System.out.println("Average square meters of all homes: " + houseService.getTotalSquareMetersOfHome());
        System.out.println("Average square meters of all houses: " + houseService.getTotalSquareMetersOfAllHouses());

        System.out.println("\nAverage price per square meter of all villas: " + houseService.getAveragePricePerSquareMeterOfVilla());
        System.out.println("Average price per square meter of all vacation homes: " + houseService.getAveragePricePerSquareMeterOfVacationHome());
        System.out.println("Average price per square meter of all homes: " + houseService.getAveragePricePerSquareMeterOfHome());
        System.out.println("Average price per square meter of all houses: " + houseService.getAveragePricePerSquareMeterOfAllHouses());

        //getHousesByRoomAndLivingRoom
        List<House> testFilter = houseService.getHousesByRoomAndLivingRoom(4, 0);

        System.out.println("\nHouses with 3 rooms and 1 living room:\n");
        for (House house : testFilter) {
            System.out.println(house.getClass().getSimpleName() + " with " + house.getRooms() + " rooms and " + house.getLivingRooms() + " living rooms");
        }



    }

}