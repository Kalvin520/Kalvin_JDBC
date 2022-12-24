package ch2_5;

import ch2.Object_oriented_Programming.Inher;
import ch2.Object_oriented_Programming.Inter;

import java.util.ArrayList;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(i);
        }


        //  解決ConcurrentModificationException最簡單的方法就是先把要刪除的東東存起來等做完第一個thread在做
        int somethingToRemove = 0;
        for(int k : arr){
            if(k == 10) {
                somethingToRemove = k;
            }
        }
        arr.remove(somethingToRemove);
    }
}
