package org.kinto2517.Services;


import org.kinto2517.Classes.House;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {

    private List<House> houseList;

    public HouseService() {
        this.houseList = new ArrayList<>();
    }

    public void addHouse(House house) {
        houseList.add(house);
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public int getTotalPriceOfHome() {
        int totalPrice = 0;
        for (House house : houseList) {
            if (house.getClass().getSimpleName().equals("Home")) {
                totalPrice += house.getPrice();
            }
        }
        return totalPrice;
    }

    public int getTotalPriceOfVilla() {
        int totalPrice = 0;
        for (House house : houseList) {
            if (house.getClass().getSimpleName().equals("Villa")) {
                totalPrice += house.getPrice();
            }
        }
        return totalPrice;
    }

    public int getTotalPriceOfVacationHome() {
        int totalPrice = 0;
        for (House house : houseList) {
            if (house.getClass().getSimpleName().equals("VacationHome")) {
                totalPrice += house.getPrice();
            }
        }
        return totalPrice;
    }

    public int getTotalPriceOfAllHouses() {
        int totalPrice = 0;
        for (House house : houseList) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    public int getTotalSquareMetersOfHome() {
        int totalSquareMeters = 0;
        int totalHome = 0;
        for (House house : houseList) {
            if (house.getClass().getSimpleName().equals("Home")) {
                totalSquareMeters += house.getSize();
                totalHome++;
            }
        }
        return totalSquareMeters / totalHome;
    }

    public int getTotalSquareMetersOfVilla() {
        int totalSquareMeters = 0;
        int totalVilla = 0;
        for (House house : houseList) {
            if (house.getClass().getSimpleName().equals("Villa")) {
                totalSquareMeters += house.getSize();
                totalVilla++;
            }
        }
        return totalSquareMeters / totalVilla;
    }

    public int getTotalSquareMetersOfVacationHome() {
        int totalSquareMeters = 0;
        int totalVacationHome = 0;
        for (House house : houseList) {
            if (house.getClass().getSimpleName().equals("VacationHome")) {
                totalSquareMeters += house.getSize();
                totalVacationHome++;
            }
        }
        return totalSquareMeters / totalVacationHome;
    }

    public int getTotalSquareMetersOfAllHouses() {
        int totalSquareMeters = 0;
        int totalHouses = 0;
        for (House house : houseList) {
            totalSquareMeters += house.getSize();
            totalHouses++;
        }
        return totalSquareMeters / totalHouses;
    }

    public int getAveragePricePerSquareMeterOfVilla() {
        int totalSquareMeters = 0;
        int totalVilla = 0;
        int totalPrice = 0;
        for (House house : houseList) {
            if (house.getClass().getSimpleName().equals("Villa")) {
                totalSquareMeters += house.getSize();
                totalVilla++;
                totalPrice += house.getPrice();
            }
        }
        return totalPrice / totalSquareMeters;
    }

    public int getAveragePricePerSquareMeterOfVacationHome() {
        int totalSquareMeters = 0;
        int totalVacationHome = 0;
        int totalPrice = 0;
        for (House house : houseList) {
            if (house.getClass().getSimpleName().equals("VacationHome")) {
                totalSquareMeters += house.getSize();
                totalVacationHome++;
                totalPrice += house.getPrice();
            }
        }
        return totalPrice / totalSquareMeters;
    }

    public int getAveragePricePerSquareMeterOfHome() {
        int totalSquareMeters = 0;
        int totalHome = 0;
        int totalPrice = 0;
        for (House house : houseList) {
            if (house.getClass().getSimpleName().equals("Home")) {
                totalSquareMeters += house.getSize();
                totalHome++;
                totalPrice += house.getPrice();
            }
        }
        return totalPrice / totalSquareMeters;
    }

    public int getAveragePricePerSquareMeterOfAllHouses() {
        int totalSquareMeters = 0;
        int totalHouses = 0;
        int totalPrice = 0;
        for (House house : houseList) {
            totalSquareMeters += house.getSize();
            totalHouses++;
            totalPrice += house.getPrice();
        }
        return totalPrice / totalSquareMeters;
    }

    public List<House> getHousesByRoomAndLivingRoom(int rooms, int livingRooms) {
        return houseList.stream()
                .filter(house -> house.getRooms() == rooms && house.getLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }

}
