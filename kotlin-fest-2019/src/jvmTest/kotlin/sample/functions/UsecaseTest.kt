package sample.functions

class Interactor<in P> : (P) -> Unit {
  override operator fun invoke(params: P) {
  }
}

fun testi() {
  val interactor = Interactor<Int>()
//  hoge(interactor)
}

//fun hoge(interactor: (Int) -> Unit) {
//}
