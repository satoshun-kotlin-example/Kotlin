package sample.nothing

import org.junit.Test

class NothingTest {
  @Test
  fun nothing() {
    val user = User

//    val name: Any = if (user.isFriend()) {
//      user.getName()
//    } else {
//      user.fail()
//    }
//    println(name.length) // Error

    run {
      val name = if (isFriend()) {
        getName()
      } else {
        fail()
      }
      println(name.length)
    }

    run {
      val name = if (isFriend()) {
        getName()
      } else {
        throw IllegalArgumentException("hoge")
      }
      println(name.length)
    }

    run {
      val name: Unit = if (isFriend()) {
        getName2()
      } else {
        fail2()
      }
      println(name)
    }

    run {
      val a: Any? = hoge()
      if (a == null) {
        NullShow.show(a)
      }
    }

    run {
      val show: Show<Nothing> = NullShow
    }
  }
}

fun hoge(): String = ""

object User

fun isFriend(): Boolean = true

fun getName(): String {
  return "name"
}

fun getName2() {
}

fun fail2() {
  throw RuntimeException()
}

fun fail(): Nothing {
  throw RuntimeException()
}

// copy from kotlintest
interface Show<in A> {
  fun show(a: A): String
  fun supports(a: Any?): Boolean
}

object NullShow : Show<Nothing?> {
  override fun supports(a: Any?): Boolean = a == null
  override fun show(a: Nothing?): String = "<null>"
}

interface Callable<T> {
  fun call(): T
}
