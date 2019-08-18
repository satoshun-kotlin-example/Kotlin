package sample.functions

fun test() {
  val a: (CharSequence) -> CharSequence = { "$it $it" }

  val a1: (CharSequence) -> CharSequence = a
  val a2: (String) -> CharSequence = a
  val a3: (CharSequence) -> Any = a
}
