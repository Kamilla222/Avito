package tech.itpark;

import tech.itpark.manager.FlatManager;
import tech.itpark.model.Flat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stations = new ArrayList<>();
        stations.add("Пушкинская");
        stations.add("Тверская");
        stations.add("Чеховская");
        Flat flat = new Flat(stations);
        List<String> districts = new ArrayList<>();
        districts.add("1");
        districts.add("2");
        flat.setDistricts(districts);
        flat.setPrice(50_000);
        flat.setFloor(5);
        flat.setRoomsAmount(3);
        FlatManager flatManager = new FlatManager();
        flatManager.save(flat);

    }

}
