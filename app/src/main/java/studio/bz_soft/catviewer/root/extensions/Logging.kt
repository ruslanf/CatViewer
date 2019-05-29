package studio.bz_soft.catviewer.root.extensions

import android.annotation.SuppressLint
import android.util.Log
import studio.bz_soft.catviewer.BuildConfig

@SuppressLint("LogNotTimber")
fun Any.debug(message: String, throwable: Throwable? = null) {
    if (!BuildConfig.DEBUG) return
    Log.d(
        if (javaClass.simpleName.isNotEmpty()) javaClass.simpleName else javaClass.name,
        message,
        throwable
    )
}

@SuppressLint("LogNotTimber")
fun Any.error(message: String, throwable: Throwable? = null) {
    if (!BuildConfig.DEBUG) return
    Log.e(
        if (javaClass.simpleName.isNotEmpty()) javaClass.simpleName else javaClass.name,
        message,
        throwable
    )
}
