package tech.itpark.manager;

import tech.itpark.model.Flat;

import java.util.ArrayList;
import java.util.List;


public class FlatManager {
    private List<Flat> items = new ArrayList<>();


    private int nextId = 1;

    public void save(Flat item) {
        if (item.getId() == 0) {
            item.setId(nextId);
            nextId++;
            items.add(item);
        }
    }


    public void update(Flat myFlat, int flatNumber) {
        items.add(flatNumber, myFlat);
    }

    public List<Flat> search(List<String> stations,
                             List<String> districts,
                             int minPrice,
                             int maxPrice,
                             int roomsAmount,
                             int floor) {
        List<Flat> result = new ArrayList<>();

        for (Flat item : items) {
            if (matches(item, stations, districts, minPrice, maxPrice, roomsAmount, floor)) {
                result.add(item);
            }
        }
        return result;
    }

    private boolean matches(Flat item,
                            List<String> stations,
                            List<String> districts,
                            int minPrice,
                            int maxPrice,
                            int roomsAmount,
                            int floor) {

        boolean isStationFound = false;
        for (String station : item.getStations()) {
            if (stations.contains(station)) {
                isStationFound = true;
            }
        }
        boolean isDistrictFound = false;
        for (String district : item.getDistricts()) {
            if (districts.contains(district)) {
                isDistrictFound = true;
            }
        }
        if (isStationFound
                && isDistrictFound
                && item.getPrice() > minPrice
                && item.getPrice() < maxPrice
                && roomsAmount == item.getRoomsAmount()
                && floor == item.getFloor()) {
            return true;
        }
        return false;
    }
}
