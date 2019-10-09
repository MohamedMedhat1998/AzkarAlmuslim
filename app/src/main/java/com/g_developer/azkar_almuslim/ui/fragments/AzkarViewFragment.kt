package com.g_developer.azkar_almuslim.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.g_developer.azkar_almuslim.R
import com.g_developer.azkar_almuslim.data.data_models.Zekr
import kotlinx.android.synthetic.main.fragment_azkar_view.view.*
import kotlinx.android.synthetic.main.item_zekr.view.*

private const val ZEKR_PARAM = "zekr"

class AzkarViewFragment : Fragment() {

    private var zekr: Zekr? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            zekr = it.getSerializable(ZEKR_PARAM) as Zekr
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_azkar_view, container, false)
        view.tvAzkarText.text = zekr?.text
        view.tvAzkarCount.text = "${zekr?.count}"
        return view
    }


    companion object {
        @JvmStatic
        fun newInstance(zekr: Zekr) =
                AzkarViewFragment().apply {
                    arguments = Bundle().apply {
                        putSerializable(ZEKR_PARAM, zekr)
                    }
                }
    }
}
