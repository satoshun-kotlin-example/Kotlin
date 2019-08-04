package sample.contract

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@ExperimentalContracts
fun contractHoge2(value: Boolean) {
  contract {
    returns() implies value
  }
  if (!value) TODO()
}