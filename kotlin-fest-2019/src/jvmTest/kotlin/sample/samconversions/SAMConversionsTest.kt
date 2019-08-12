package sample.samconversions

import org.junit.Test

class SAMConversionsTest {
  @Test
  fun test() {
//    SamTest.test(SamTest.A { b -> println(b) }) { a -> println(a) }
//    val number = Observable.just(42)
//    val text = Observable.just("42")
//    val combination = Observable
//      .combineLatest(number, text, BiFunction { currentNumber, currentText ->
//        currentNumber to currentText
//      })
  }
}

fun test(r: Runnable) {
  SamTest.foo({}) { }
}