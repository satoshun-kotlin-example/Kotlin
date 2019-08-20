package sample.nothing

import org.junit.Test

class NothingDemo {
  @Test
  fun test() {
  }
}

fun test(any: Any): String {
  when (any) {
    is Int -> return "int"
    is String -> return "string"
    else -> fail()
  }
}
