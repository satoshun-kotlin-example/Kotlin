package sample.list

import kotlinx.collections.immutable.persistentListOf
import org.junit.Test

class ListTest {
  @Test
  fun t() {
    run {
      val a = mutableListOf<String>("1", "2")
      List2.l(a)
      List2.l2(a)

      val a2: List<Any> = a
    }

    run {
      val a = listOf<String>("1", "2")
      List2.l(a)
      List2.l2(a)

      val a2: List<Any> = a
    }

    run {
      val a = persistentListOf<String>("1", "2")
      List2.l(a)
      List2.l2(a)
    }
  }

  @Test
  fun t2() {
    run {
      val a = mapOf("1" to 1, "2" to 2)
      for (element in a) {
        println(element.javaClass)
      }
    }
  }
}
