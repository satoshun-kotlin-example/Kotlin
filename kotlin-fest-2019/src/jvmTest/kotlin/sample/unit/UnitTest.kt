package sample.unit

import org.junit.Test

var isFuga = true

class UnitTest {
  @Test
  fun test() {
    val e = empty()
    println(e)
  }
}

fun empty() {
}

fun hoge(): Int {
  return 10
}
