package sample.generics

import org.junit.Test

class ListMutableListTest {
  @Test
  fun test() {
    run {
      val strs: List<String> = listOf("a", "b")
      val anys: List<Any> = strs
      val any: Any = strs[0]
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
