package sample.obj

import org.junit.Test

class ObjectExpressionTest {
  @Test
  fun kt() {
    object : A {
      override fun b() {
      }
    }
  }

  @Test
  fun java() {
    val a = object : Runnable {
      override fun run() {
      }
    }
    Thread(a).run()
    val b = Runnable { print(100) }
    Thread(b).run()
  }
}