package tech.itpark;

import tech.itpark.manager.FlatManager;
import tech.itpark.model.Flat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stations = new ArrayList<>();
        stations.add("Пушкинская");
        stations.add("Тверская");
        stations.add("Чеховская");
        Flat flat = new Flat(stations);
        new FlatManager();
    }
}
