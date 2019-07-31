package sample.sealed

import org.junit.Test

class SealedClassTest {
  @Test
  fun `when expression`() {
    val animal = animal()
    val result = when (animal) {
      is Animal.Cat -> {
        animal.name
      }
      is Animal.Dog -> {
        animal.name
      }
    }
  }
}

private fun animal(): Animal =
  if (true) Animal.Cat(name = "cat")
  else Animal.Dog(name = "dog")
