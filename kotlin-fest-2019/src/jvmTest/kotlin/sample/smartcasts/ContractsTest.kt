package sample.smartcasts

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.test.assertFalse
import kotlin.test.assertTrue

fun test4(strs: List<String>?) {
//  val strs: List<String>?
  if (!strs.isNullOrEmpty()) {
    println(strs.size)
  }
}

fun test5(obj: String?) {
  assertTrue(obj != null)
  print(obj.length)
}

fun test55(obj: String?) {
  assertFalse(obj == null)
  print(obj.length)
}

fun test6(obj: String?) {
  val s: String
  run {
    s = ""
  }
  println(s)
}

fun test2(obj: Any?) {
  run {
  }

  run {
    if (checkObj(obj)) {
      obj!!.javaClass
    }
  }

  run {
    if (checkObj2(obj)) {
      val a: Any = obj
    }
  }

  run {
    listOf<Any>().isNullOrEmpty()
  }
}

fun checkObj(obj: Any?): Boolean {
  return obj != null
}

@UseExperimental(ExperimentalContracts::class)
fun checkObj2(obj: Any?): Boolean {
  contract {
    returns(true) implies (obj != null)
  }
  return obj != null
}
