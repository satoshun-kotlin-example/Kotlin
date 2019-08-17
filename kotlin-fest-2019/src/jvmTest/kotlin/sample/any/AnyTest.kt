package sample.any

fun test(obj: String) {
  val s = ""
  (s as Object).notify()
  s.getClass()
}