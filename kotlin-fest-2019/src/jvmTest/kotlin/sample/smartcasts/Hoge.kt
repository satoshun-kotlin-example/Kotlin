package sample.smartcasts

class Hoge {
  private var obj: Any = "a"

  fun test() {
    obj.let {
      if (it is String) {
        print(it.length)
      }
    }
  }
}
