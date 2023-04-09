package P2_Generics.L4_subTyping;

import java.util.ArrayList;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
//        X x = new Y();
//        List<X> list1 = new ArrayList<>();
        List<Number> list = new ArrayList<>();
    }
}

class X {
}

class Y extends X {
}