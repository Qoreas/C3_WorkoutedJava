package P2_Generics.L3_Type_erasure;

public class T1 {


    public void abc(Info<Integer> info) {
        Integer s = info.getValue();
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