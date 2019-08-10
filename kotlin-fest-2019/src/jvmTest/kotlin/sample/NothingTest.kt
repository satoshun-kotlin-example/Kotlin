package sample

import org.junit.Test

class NothingTest {
  @Test
  fun nothing() {
  }
}

fun getPartnerName(): String {
  return "name"
}

fun failGetName() {
  throw RuntimeException()
}
