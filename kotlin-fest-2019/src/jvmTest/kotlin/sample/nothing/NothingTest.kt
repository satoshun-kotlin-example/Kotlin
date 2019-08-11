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

    val name = if (user.isFriend()) {
      user.getName()
    } else {
      user.fail2()
    }
    println(name.length) // Success

    val a : Any? = hoge()
    if (a == null) {
      NullShow.show(a)
    }
  }
}

fun hoge() : String = ""

object User

fun User.isFriend(): Boolean = true

fun User.getName(): String {
  return "name"
}

fun User.fail() {
  throw RuntimeException()
}

fun User.fail2(): Nothing {
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
