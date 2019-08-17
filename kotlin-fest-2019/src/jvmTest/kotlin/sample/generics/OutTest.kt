package sample.generics

import org.junit.Test

class OutTest {
  @Test
  fun test() {
    val mapper = Mapper<Number>()
    val mapping: (String) -> Int = { it.toInt() }
    mapper.map(mapping)
  }
}

class Mapper<T> {
  fun map(mapping: (String) -> T): T {
    return mapping("100")
  }
}
