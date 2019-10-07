package com.g_developer.azkar_almuslim.ui.home_activity

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.g_developer.azkar_almuslim.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() , HomeActivityContract.View{
    private lateinit var presenter: HomeActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL
        }
        setContentView(R.layout.activity_home)

        presenter = HomeActivityPresenter(this)

        btnAzkar.setOnClickListener {
            presenter.onAzkarClicked()
        }

        btnAd3ya.setOnClickListener {
            presenter.onAd3yaClicked()
        }

        btnTasbee7.setOnClickListener {
            presenter.onTasbee7Clicked()
        }

        btnSavedItems.setOnClickListener {
            presenter.onSavedItemClicked()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item_settings -> presenter.onSettingsClicked()
            R.id.item_privacy_policy -> presenter.onPrivacyPolicyClicked()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun openBrowser(link: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(link)
        startActivity(intent)
    }

    override fun openActivity(target: Class<*>) {
        startActivity(Intent(this,target))
    }
}
