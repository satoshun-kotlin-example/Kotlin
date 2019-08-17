package sample.smartcasts

fun test3(obj: Any?) {
  run {
  }
  if (obj is String) {
    print(obj.length)
  }

  run {
    if (obj !is String) return
    print((obj as String).length)
  }

  run {
    when (obj) {
      is Int -> print((obj as Int) + 1)
      is String -> print((obj as String).length + 1)
    }
  }

  run {
    if (hoge() && obj is Int) {
      (obj as Int).toLong()
    }
  }

  run {
    if (obj is String && obj is Int) {
      (obj as String).length
      (obj as Int).toLong()
    }
  }
}

private fun hoge() = true

fun test(obj: Any) {
  if (obj is String) {
    print((obj as String).length)
  }
}
