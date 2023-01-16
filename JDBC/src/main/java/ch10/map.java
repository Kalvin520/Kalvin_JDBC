package ch10;


import java.util.HashMap;
import java.util.Map;

public class map {
    public map() {  // Generics
        Map<String, Integer> incomeMap = new HashMap<>();
        incomeMap.put("Kalvin",60000);
        incomeMap.put("Ron",45000);
        incomeMap.put("wilson",50000);
        incomeMap.put("Grace",60000);

        System.out.println("========================");

        for (Map.Entry<String, Integer> entry : incomeMap.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        new map();
    }
}
