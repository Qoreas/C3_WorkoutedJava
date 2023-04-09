package P2_Generics.L2_Parameterized_method;

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(3232);
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("fewfe");
        list2.add("qdq");
        list2.add("fjwenfo");
        String s = GenMethod.getSecondElement(list2);
        System.out.println(s);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}