package com.g_developer.azkar_almuslim.listeners

import android.view.animation.Animation

abstract class AnimationFinishedListener : Animation.AnimationListener{

    abstract fun onFinished()

    override fun onAnimationRepeat(p0: Animation?) {
    }

    override fun onAnimationEnd(p0: Animation?) {
        onFinished()
    }

    override fun onAnimationStart(p0: Animation?) {
    }
}