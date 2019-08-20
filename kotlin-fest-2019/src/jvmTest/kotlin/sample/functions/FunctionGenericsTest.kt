package sample.functions

fun test() {
  val a: (Number) -> Number = { it }

  val a1: (Int) -> Number = a
  val a2: (Number) -> Any = a
}
