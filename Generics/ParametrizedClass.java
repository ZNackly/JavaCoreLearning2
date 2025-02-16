package Generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(2);
        System.out.println(info1);
        System.out.println(info2);

    }

}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info [value= " + value + "]";
    }

    public T getValue() {
        return value;
    }
}