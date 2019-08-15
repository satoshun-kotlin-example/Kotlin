package sample.samconversions;

import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;

public class Observable2 {
    public static <T1, T2, R> Observable<R> combineLatest(
            Observable<? extends T1> source1,
            Observable<? extends T2> source2,
            BiFunction<? super T1, ? super T2, ? extends R> combiner) {
        return Observable.combineLatest(source1, source2, combiner);
    }
}
