package sample.functions

import org.junit.Test

class FunctionTest {
  @Test
  fun test() {
    hoge { }
  }
}

private fun hoge(body: () -> Unit) {
}
