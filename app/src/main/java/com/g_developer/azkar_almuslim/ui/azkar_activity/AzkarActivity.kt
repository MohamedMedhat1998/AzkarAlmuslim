package com.g_developer.azkar_almuslim.ui.azkar_activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.g_developer.azkar_almuslim.R
import com.g_developer.azkar_almuslim.adapters.AzkarAdapter
import com.g_developer.azkar_almuslim.data.data_models.Zekr
import kotlinx.android.synthetic.main.activity_azkar.*

class AzkarActivity : AppCompatActivity(), AzkarActivityContract.View {

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

    override fun populateRecyclerViewWithData(data: List<Zekr>?) {
        rvAzkar.layoutManager = LinearLayoutManager(this)
        if (data != null)
            rvAzkar.adapter = AzkarAdapter(data)

    }
}
