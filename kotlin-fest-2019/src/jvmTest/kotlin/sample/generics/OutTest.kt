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

fun a() {
  run {
    class A<out T>

    val a: A<Int> = A<Int>()
    val b: A<Number> = a
  }

  run {
    class A<T>

    val a: A<Int> = A<Int>()
//    val b: A<Number> = a
  }

  run {
    class A<in T>

    val a: A<Number> = A<Number>()
    val b: A<Int> = a
  }
}