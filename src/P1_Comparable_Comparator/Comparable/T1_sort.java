package P1_Comparable_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T1_sort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Maria");
        list.add("Ivan");

        System.out.println("Before sort - " + list);
        Collections.sort(list);
        System.out.println("After sort - " + list);

    }
}
