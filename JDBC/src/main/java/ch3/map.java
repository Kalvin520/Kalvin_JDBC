package ch3;
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
        //method 1
//        for (Map.Entry<String, Integer> entry : incomeMap.entrySet()){
//            System.out.println(entry.getKey() + ", " + entry.getValue());
//        }
        //method 2 Lambda寫法
        incomeMap.forEach((name, income) ->{
            System.out.println(name + ", " + income);
        });
    }

    public static void main(String[] args) {
        new map();
    }
}
