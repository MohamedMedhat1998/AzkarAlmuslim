package com.g_developer.azkar_almuslim.ui.activities.azkar_details_activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.app.AppCompatActivity
import com.g_developer.azkar_almuslim.R
import com.g_developer.azkar_almuslim.adapters.AzkarFragmentsAdapter
import com.g_developer.azkar_almuslim.data.data_models.Azkar
import com.g_developer.azkar_almuslim.ui.fragments.AzkarViewFragment
import com.g_developer.azkar_almuslim.utils.Constants
import kotlinx.android.synthetic.main.activity_azkar_details.*

class AzkarDetailsActivity : AppCompatActivity(), AzkarDetailsActivityContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azkar_details)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        MenuInflater(this).inflate(R.menu.azkar_details_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun populateViewPagerWithData(data: List<AzkarViewFragment>) {
        //TODO review this function
        vpAzkar.adapter = AzkarFragmentsAdapter(supportFragmentManager, data)
    }

    override fun getRecievedData(): Azkar {
        return intent.extras?.getSerializable(Constants.AZKAR_KEY) as Azkar
    }
}
