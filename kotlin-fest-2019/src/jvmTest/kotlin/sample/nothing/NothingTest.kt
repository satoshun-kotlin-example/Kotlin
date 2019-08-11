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

    TODO()
  }
}

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
