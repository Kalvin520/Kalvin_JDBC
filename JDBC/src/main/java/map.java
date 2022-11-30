import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        // 選擇HashMap來創建新的Map物件
        Map<String, Integer> testingMapObject = new HashMap<>();

        // 新增元素(element)到Map物件 - testingMapObject
        testingMapObject.put("One", 1);
        testingMapObject.put("Two", 2);

        // 列出testingMapObject內的所有key及對應的value
        System.out.println("Map: " + testingMapObject);

        // 列出testingMapObject內的所有key
        System.out.println("Keys: " + testingMapObject.keySet());

        // 列出testingMapObject內的所有value
        System.out.println("Values: " + testingMapObject.values());

        // 列出testingMapObject內的所有key及對應的value
        System.out.println("Entries: " + testingMapObject.entrySet());

        // 檢查testingMapObject內有沒有特定元素的key
        System.out.println("Contain 2?: " + testingMapObject.containsKey("Two"));

        // 刪除testingMapObject內的一個元素，然後把相對應的值列印出來
        int value = testingMapObject.remove("Two");
        System.out.println("Removed Value: " + value);

        // 檢查testingMapObject內有沒有特定元素的key
        System.out.println("Contain 2?: " + testingMapObject.containsKey("Two"));

        // 檢查testingMapObject內有沒有特定元素的key
        testingMapObject.putIfAbsent("One",2);
    }
}
