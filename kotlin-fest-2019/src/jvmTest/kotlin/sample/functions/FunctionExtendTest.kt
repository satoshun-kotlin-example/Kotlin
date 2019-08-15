package sample.functions

import org.junit.Test

class FunctionExtendTest {
  @Test
  fun test() {
    val a = A()
    a(10)
  }
}

class A : (Int) -> Unit {
  override fun invoke(p1: Int) {
    println("call $p1")
  }
}
