package tech.itpark.model;

import java.util.ArrayList;

public class Flat {
    private int id;
    private ArrayList<String> stations = new ArrayList<>();
    private int price;
    private int floor;
    private int roomsAmount;
    private ArrayList<String> districts;

    public Flat(int id, ArrayList<String> stations, int price, int floor, int room, ArrayList<String> districts) {
        this.id = id;
        this.stations = stations;
        this.price = price;
        this.floor = floor;
        this.roomsAmount = room;
        this.districts = districts;
    }

    public Flat(ArrayList<String> stations) {
        this.stations = stations;
    }

    public Flat(int id, ArrayList<String> stations) {
        this.id = id;
        this.stations = stations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getStations() {
        return stations;
    }

    public void setStations(ArrayList<String> stations) {
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

    public ArrayList<String> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<String> districts) {
        this.districts = districts;
    }
}
