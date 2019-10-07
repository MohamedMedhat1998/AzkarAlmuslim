package com.g_developer.azkar_almuslim.ui.splash_activity

import com.g_developer.azkar_almuslim.ui.home_activity.HomeActivity
import com.g_developer.azkar_almuslim.utils.DatabaseLoader

class SplashActivityPresenter(private val view: SplashActivityContract.View, private val databaseLoader: DatabaseLoader) : SplashActivityContract.Presenter {

    override fun onAnimationFinished() {
        view.openActivity(HomeActivity::class.java)
    }

    override fun onLoad() {
        databaseLoader.loadDatabase()
        view.playAnimation()
    }

}