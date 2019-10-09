package com.g_developer.azkar_almuslim.ui.activities.splash_activity

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.animation.AlphaAnimation
import androidx.appcompat.app.AppCompatActivity
import com.g_developer.azkar_almuslim.R
import com.g_developer.azkar_almuslim.listeners.AnimationFinishedListener
import com.g_developer.azkar_almuslim.utils.DatabaseLoader
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashActivity : AppCompatActivity(), SplashActivityContract.View {
    private lateinit var presenter: SplashActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash_screen)

        presenter = SplashActivityPresenter(this, DatabaseLoader(this))

        presenter.onLoad()

    }


    override fun playAnimation() {
        val fadeIn = AlphaAnimation(0f, 1f)
        fadeIn.duration = 1000
        ivLogoSplash.startAnimation(fadeIn)
        fadeIn.setAnimationListener(object : AnimationFinishedListener() {
            override fun onFinished() {
                presenter.onAnimationFinished()
            }
        })
    }

    override fun openActivity(target: Class<*>, data: Any) {
        startActivity(Intent(this, target))
        finish()
    }

}
