package sample.samconversions

import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import org.junit.Test

class SAMConversionsTest {
  @Test
  fun test() {
//    SamTest.test(SamTest.A { b -> println(b) }) { a -> println(a) }

    run {
      val o1 = Observable.just(1) as ObservableImpl
      val o2 = Observable.just(2) as ObservableImpl
      val a: Observable<Pair<Int, Int>> = Observable
        .combineLatest(o1, o2, BiFunction { n1, n2 ->
          n1 to n2
        })

      val b: Observable<Pair<Int, Int>> = combineLatest2(o1, o2, BiFunction { n1, n2 ->
        n1 to n2
      })

      val c: Observable<Pair<Int, Int>> = Observable2.combineLatest(
        o1, o2, { n1, n2 ->
          n1 to n2
        })
    }

    run {
      val o1 = Observable.just(1)
      val o2 = Observable.just(2)
      val a: Observable<Pair<Int, Int>> = Observable
        .combineLatest<Int, Int, Pair<Int, Int>>(o1, o2, { n1, n2 ->
          n1 to n2
        })
    }
  }
}

fun <T1, T2, R> combineLatest3(
  a: Int,
  combiner: BiFunction<in T1, in T2, out R>
): Observable<R> {
  TODO()
}

fun <T1, T2, R> combineLatest2(
  source1: ObservableImpl<out T1>,
  source2: ObservableImpl<out T2>,
  combiner: BiFunction<in T1, in T2, out R>
): Observable<R> {
  TODO()
}

fun test(r: Runnable) {
  SamTest.foo(r, Runnable { })
}
