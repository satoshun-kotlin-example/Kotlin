package sample.generics

import org.junit.Test

class OutTest {
  @Test
  fun test() {
    val mapper = IntMapper()
    hoge(mapper)
  }
}

interface Mapper<out T> {
  fun map(s: String): T
}

class IntMapper : Mapper<Int> {
  override fun map(s: String): Int = s.toInt()
}

fun hoge(mapper: Mapper<Number>) {
  mapper.map("10")
}
