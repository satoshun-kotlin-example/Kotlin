package sample.smartcasts

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

fun test2(obj: Any?) {
  run {
    if (checkObj(obj)) {
      // ここでobjがnullではないことを保証したい
//      val a: Any = obj
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
