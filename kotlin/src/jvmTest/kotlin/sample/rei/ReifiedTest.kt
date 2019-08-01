package sample.rei

import org.junit.Test

inline fun <T> ttt() {
//  val a = T::class
}

inline fun <reified T> foo() {
  val a = T::class
  val x = 1

  x is T
  T::class.java
}

class ReifiedTest {
  @Test
  fun rei() {
    foo<Int>()
  }
}