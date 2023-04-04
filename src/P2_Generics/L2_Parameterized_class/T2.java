package P2_Generics.L2_Parameterized_class;

public class T2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 1);
        System.out.println(pair1.getFirstValue() + " - " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(4432, 1.2222);
        System.out.println(pair2.getFirstValue() + " - " + pair2.getSecondValue());

        OtherPair<String> other = new OtherPair<>("ok", "bye");
        System.out.println(other.getFirstValue() + " - " + other.getSecondValue());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}