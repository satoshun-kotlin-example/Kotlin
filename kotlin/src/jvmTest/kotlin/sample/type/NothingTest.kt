package sample.type

import org.junit.Test

class NothingTest {
  private lateinit var c: Nothing

  @Test
  fun nothing() {
    println(Nothing::class.java)

    val variable = null

    c = n()
    hoge(c)

//    val b: Nothing = n()
//    println(b)

//    val a = throw IllegalArgumentException("test")
//    println(a)
  }
}

private fun hoge(a: Nothing) {
}

private fun n(): Nothing {
  throw  IllegalArgumentException("")
}

sealed class LinkedList<out T> {
  data class Node<T>(val payload: T, var next: LinkedList<T>) : LinkedList<T>()
  //  object EmptyList<T> : LinkedList<T>() // won't compile
  object EmptyList : LinkedList<Any>() // won't compile
}
