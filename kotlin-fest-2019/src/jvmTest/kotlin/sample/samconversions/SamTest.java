package sample.samconversions;

public class SamTest {
    interface A {
        void run(int a);
    }

    public static void test(A a, A b) {
        a.run(1);
        b.run(2);
    }

    public static void foo(Runnable a, Runnable b) {
    }
}
