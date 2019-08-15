package sample.samconversions

import io.reactivex.Observable
import io.reactivex.Observer

class ObservableImpl<T> : Observable<T>() {
  override fun subscribeActual(observer: Observer<in T>?) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}