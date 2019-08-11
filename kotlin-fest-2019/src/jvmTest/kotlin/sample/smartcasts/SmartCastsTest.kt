package sample.smartcasts

fun test(obj: Any?) {
  run {
    if (obj is String) {
      print(obj.length)
    }
  }

  run {
    if (obj !is String) return
    print(obj.length)
  }

  run {
    when (obj) {
      is Int -> print(obj + 1)
      is String -> print(obj.length + 1)
      is IntArray -> print(obj.sum())
    }
  }

  run {
    if (hoge() && obj is Int) {
      obj.toLong()
    }
  }

  run {
    if (obj is String && obj is Int) {
      obj.length
      obj.toLong()
    }
  }
}

private fun hoge() = true
