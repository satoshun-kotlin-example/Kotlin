package sample.generics

class Box<T : Comparable<T>>(
  var t: T
)
