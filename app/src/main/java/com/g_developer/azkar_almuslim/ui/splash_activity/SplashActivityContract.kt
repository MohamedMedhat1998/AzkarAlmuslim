package com.g_developer.azkar_almuslim.ui.splash_activity

import com.g_developer.azkar_almuslim.behaviors.CanOpenActivity

interface SplashActivityContract {

    interface View : CanOpenActivity {
        fun playAnimation()
    }

    interface Presenter {
        fun onLoad()
        fun onAnimationFinished()
    }

}