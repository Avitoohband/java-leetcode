package src.removeoddselementfromarray;

import java.util.ArrayList;
import java.util.List;

public class remove {


    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(integers);
        removeOdds(integers);
        System.out.println(integers);


    }
    public static void removeOdds(List<Integer> list){
        list.removeIf(i -> i % 2 != 0);
    }
}
