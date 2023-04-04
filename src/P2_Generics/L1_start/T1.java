package P2_Generics.L1_start;

import java.util.ArrayList;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("bye");
        list.add("ddqwd");
        list.add("fwf3");

        for (Object o : list) {
            System.out.println(o + " " + ((String) o).length());
        }
    }
}
