package com.g_developer.azkar_almuslim.ui.activities.azkar_activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.g_developer.azkar_almuslim.R
import com.g_developer.azkar_almuslim.adapters.AzkarAdapter
import com.g_developer.azkar_almuslim.data.data_models.Azkar
import com.g_developer.azkar_almuslim.listeners.AzkarAdapterClickListener
import com.g_developer.azkar_almuslim.utils.Constants
import kotlinx.android.synthetic.main.activity_azkar.*

class AzkarActivity : AppCompatActivity(), AzkarActivityContract.View, AzkarAdapterClickListener {
    private lateinit var presenter: AzkarActivityPresenter

    private lateinit var model: AzkarActivityModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azkar)

        presenter = AzkarActivityPresenter(this)
        model = AzkarActivityModel(this)
        presenter.model = model
        model.presenter = presenter

        presenter.onLoad()

    }

    override fun populateRecyclerViewWithData(data: List<Azkar>?) {
        rvAzkar.layoutManager = LinearLayoutManager(this)
        if (data != null) {
            rvAzkar.adapter = AzkarAdapter(data).apply { clickListener = this@AzkarActivity }
        }
    }

    override fun onItemClicked(data: Azkar) {
        presenter.onItemClicked(data)
    }

    override fun onPlayClicked(data: Azkar) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFavoriteClicked(data: Azkar) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openActivity(target: Class<*>, data: Any) {
        val zekr = data as Azkar
        val intent = Intent(this, target)
        intent.putExtra(Constants.AZKAR_KEY, zekr)
        startActivity(intent)
    }
}
