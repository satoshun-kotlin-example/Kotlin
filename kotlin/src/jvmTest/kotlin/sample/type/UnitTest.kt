package sample.type

import org.junit.Test

var c = true

class UnitTest {
  @Test
  fun t() {
    run {
      val a = if (c) T1.a() else 10
      val b = T1.b()
      println(a)
      println(b)
    }

    println("newline")

    run {
      val a = if (c) T2.a() else 10
      val b = T1.b()
      println(a)
      println(b)
    }

    val t2 = T2()

    val abc: String = ""
  }
}
