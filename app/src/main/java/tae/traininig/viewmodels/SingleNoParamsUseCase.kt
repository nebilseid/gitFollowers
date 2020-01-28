package tae.traininig.viewmodels

import io.reactivex.Single
import tae.traininig.common.ThreadScheduler

abstract class SingleNoParamsUseCase<T>(private val threadScheduler: ThreadScheduler) {

    abstract fun create(): Single<T>

    fun execute(): Single<T> = create()
        .subscribeOn(threadScheduler.io())
        .observeOn(threadScheduler.main())
}