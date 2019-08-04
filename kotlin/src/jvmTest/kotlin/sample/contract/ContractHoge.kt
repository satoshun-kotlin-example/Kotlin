package sample.contract

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@ExperimentalContracts
fun contractHoge(value: Boolean) {
  contract {
    returns() implies value
  }
  if (!value) TODO()
}
