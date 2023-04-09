package P2_Generics.L5_wildCards;

import java.util.ArrayList;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
//        List<?> list = new ArrayList<Integer>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(4);

        List<String> list2 = List.of("fewnfe", "fiwnfeowi");

        showListInfo(list1);
        showListInfo(list2);

        System.out.println(summ(list1));
    }

    static void showListInfo(List<?> list) {
        System.out.println("List elements " + list);
    }

    public static double summ(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
