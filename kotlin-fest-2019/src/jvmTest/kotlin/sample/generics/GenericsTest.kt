package sample.generics

import org.junit.Test

class GenericsTest {
  @Test
  fun a() {
  }
}

// declaration-site variance

// out modifier
// covariant

interface Source<out T> {
  fun nextT(): T
}

fun demo(strs: Source<String>) {
  val objects: Source<Any> = strs
}

// in modifier
// contravariant

interface Comparable<in T> {
  operator fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
  x.compareTo(1.0)
  val y: Comparable<Double> = x

  val a = arrayOf(1) as Array<Any>
  fill(a, 10)
}

// use-site variance

fun fill(dest: Array<in Number>, value: Number) {
  TODO()
}
