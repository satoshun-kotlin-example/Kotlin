package sample.type;

import kotlin.Unit;

public class T2 {
    public static void a() {
    }

    public static Unit b() {
        return Unit.INSTANCE;
    }

    public static void c() {
        try {
            new Integer(10).wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
