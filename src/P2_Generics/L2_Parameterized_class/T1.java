package P2_Generics.L2_Parameterized_class;

public class T1 {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(111);
        System.out.println(info2);
        Integer s2 = info2.getValue();
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}