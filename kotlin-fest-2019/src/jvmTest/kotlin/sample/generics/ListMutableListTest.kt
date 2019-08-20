package sample.generics

import org.junit.Test

class ListMutableListTest {
  @Test
  fun test() {
    run {
      val strs: List<String> = listOf("a", "b")
      val anys: List<Any> = strs
      val a: Any = anys[0]
      val anys2 = anys.subList(0, 1)
      val a2: Any? = anys2.getOrNull(1)
    }

    run {
//      val strs: MutableList<String> = mutableListOf("a", "b")
//      val anys: MutableList<Any> = strs
//
//      anys.last()
    }

    run {
      val a: Comparable<A> = A()
      val b: Comparable<B> = a
      b.compareTo(B())
    }
  }
}

open class A : Comparable<A> {
  override fun compareTo(other: A): Int {
    TODO("not implemented")
  }
}

open class B : A() {
  override fun compareTo(other: A): Int {
    return super.compareTo(other)
  }
}
