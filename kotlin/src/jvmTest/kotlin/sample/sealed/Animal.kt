package sample.sealed

sealed class Animal {
  class Cat(val name: String) : Animal()
  class Dog(val name: String) : Animal()
}

abstract class Animal2 private constructor() {
  class Cat(val name: String) : Animal2() {
    fun method() {
      val a = object : Animal2() {}
    }
  }
}
