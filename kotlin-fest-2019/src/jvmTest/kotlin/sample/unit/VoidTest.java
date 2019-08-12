package sample.unit;

public class VoidTest {
    void test() {
        Void a = test2();
    }

    private Void test2() {
        throw new IllegalArgumentException("");
    }
}
