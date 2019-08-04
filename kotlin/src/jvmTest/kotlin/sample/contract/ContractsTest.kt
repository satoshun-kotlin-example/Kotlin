package sample.contract

import org.junit.Test

class ContractsTest {
  @Test
  fun a() {
    val a: String? = "10"
    require(a is String)
    println(a.length)

    synchronized(a) {
    }
    a.isNullOrEmpty()
  }
}

