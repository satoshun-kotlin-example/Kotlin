package sample.functions

import org.junit.Test

class FunctionTest {
  @Test
  fun test() {
    hoge { it.toString() }

    val a: (Int, Int) -> Int = ::add
    a(10, 20)

    val curried = a.curried()
    curried(10)(20)
  }
}

private fun hoge(body: (Int) -> String) {
  body(10)
}

private fun hoge2(body: (Int, String) -> String) {
  body(10, "hoge")
}

fun add(a1: Int, a2: Int): Int {
  return a1 + a2
}

private fun hoge3(
  body: (
    p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int,
    p11: Int, p12: Int, p13: Int, p14: Int, p15: Int, p16: Int, p17: Int, p18: Int, p19: Int, p20: Int,
    p21: Int, p22: Int,
    p23: Int
  ) -> Unit
) {
}

fun <P1, P2, R> ((P1, P2) -> R).curried(): (P1) -> (P2) -> R = { p1: P1 -> { p2: P2 -> this(p1, p2) } }
