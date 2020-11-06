package tech.itpark.model;

import java.util.ArrayList;
import java.util.List;

public class Flat {
    private int id;
    private List<String> stations = new ArrayList<>();
    private int price;
    private int floor;
    private int roomsAmount;
    private List<String> districts;

    public Flat(int id, List<String> stations, int price, int floor, int room, List<String> districts) {
        this.id = id;
        this.stations = stations;
        this.price = price;
        this.floor = floor;
        this.roomsAmount = room;
        this.districts = districts;
    }

    public Flat(List<String> stations) {
        this.stations = stations;
    }

    public Flat(int id, List<String> stations) {
        this.id = id;
        this.stations = stations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomsAmount() {
        return roomsAmount;
    }

    public void setRoomsAmount(int roomsAmount) {
        this.roomsAmount = roomsAmount;
    }

    public List<String> getDistricts() {
        return districts;
    }

    public void setDistricts(List<String> districts) {
        this.districts = districts;
    }
}
