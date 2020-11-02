package tech.itpark.manager;

import tech.itpark.model.Flat;

import java.util.ArrayList;


public class FlatManager {
    private ArrayList<Flat> items = new ArrayList<>();
    private int nextId = 1;

    public void save(Flat item) {
        if (item.getId() == 0) {
            item.setId(nextId);
            nextId++;
            items.add(item);
        }
        // TODO: handle update
    }

    public ArrayList<Flat> search(ArrayList<String> stations,
                                  ArrayList<String> districts,
                                  int minPrice,
                                  int maxPrice,
                                  int roomsAmount,
                                  int floor) {
        ArrayList<Flat> result = new ArrayList<>();

        for (Flat item : items) {
            if (containsAny(item, stations, districts, minPrice, maxPrice, roomsAmount, floor)) {
                result.add(item);
            }
        }
        return result;
    }

    private boolean containsAny(Flat item,
                                ArrayList<String> stations,
                                ArrayList<String> districts,
                                int minPrice,
                                int maxPrice,
                                int roomsAmount,
                                int floor) {
        for (String station : item.getStations()) {
            if (stations.contains(station)) {
                return true;
            }
        }
        for (String district : item.getDistricts()) {
            if (districts.contains(district)) {
                return true;
            }

        }
        if (item.getPrice() > minPrice && item.getPrice() < maxPrice) {
            return true;
        }
        if (roomsAmount == item.getRoomsAmount()) {
            return true;
        }
        if (floor == item.getFloor()) {
            return true;
        }
        return false;
    }
}
