package sample.reifiedtest

import org.junit.Test

class ReifiedTest {
  @Test
  fun test() {
  }
}

inline fun <reified T> hoge(obj: Any) {
  println(T::class.java)

  if (obj is T) {
    println("obj is T")
  }
}
