package sample.generics

import org.junit.Test

class WhereTest {
  @Test
  fun test() {
    val a = listOf("")
    copyWhenGreater(a, "a")

    val activity = OnClickActivity()
    setClick(activity)

    val activity2 = OnClickActivity2()
    setClick(activity2)
  }
}

fun <T : CharSequence> hoge() {}

fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
    where T : CharSequence,
          T : Comparable<T> {
  return list.filter { it > threshold }.map { it.toString() }
}

open class Activity() {
  fun onCreate() {
    TODO()
  }
}

interface OnClickListener {
  fun setClickListener() {
    TODO()
  }
}

class OnClickActivity() : Activity(), OnClickListener
class OnClickActivity2() : Activity(), OnClickListener

fun <T> setClick(activity: T)
    where T : Activity,
          T : OnClickListener {
  activity.onCreate()
  activity.setClickListener()
}
