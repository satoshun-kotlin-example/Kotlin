package sample.sealedclass

sealed class Either: Cloneable

object Left : Either()
object Right : Either()

fun test(obj: Either) {
  when (obj) {
    Left -> println("is Left")
    Right -> println("is Right")
  }
}
