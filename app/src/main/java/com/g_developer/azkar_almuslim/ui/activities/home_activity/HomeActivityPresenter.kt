package com.g_developer.azkar_almuslim.ui.activities.home_activity

import com.g_developer.azkar_almuslim.Ad3yaActivity
import com.g_developer.azkar_almuslim.ui.activities.azkar_activity.AzkarActivity
import com.g_developer.azkar_almuslim.CounterActivity
import com.g_developer.azkar_almuslim.SavedItemsActivity

class HomeActivityPresenter(private val view: HomeActivityContract.View) : HomeActivityContract.Presenter {
    override fun onAzkarClicked() {
        view.openActivity(AzkarActivity::class.java)
    }

    override fun onAd3yaClicked() {
        view.openActivity(Ad3yaActivity::class.java)
    }

    override fun onTasbee7Clicked() {
        view.openActivity(CounterActivity::class.java)
    }

    override fun onSavedItemClicked() {
        view.openActivity(SavedItemsActivity::class.java)
    }

    override fun onSettingsClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onPrivacyPolicyClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}