package com.g_developer.azkar_almuslim.ui.home_activity

import com.g_developer.azkar_almuslim.behaviors.CanOpenActivity
import com.g_developer.azkar_almuslim.behaviors.CanOpenBrowser

interface HomeActivityContract {

    interface View : CanOpenActivity, CanOpenBrowser

    interface Presenter{
        fun onAzkarClicked()
        fun onAd3yaClicked()
        fun onTasbee7Clicked()
        fun onSavedItemClicked()
        fun onSettingsClicked()
        fun onPrivacyPolicyClicked()
    }
}