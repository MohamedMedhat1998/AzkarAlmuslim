package com.g_developer.azkar_almuslim.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.g_developer.azkar_almuslim.R
import com.g_developer.azkar_almuslim.data.data_models.Zekr

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ZEKR_PARAM = "zekr"

/**
 * A simple [Fragment] subclass.
 * Use the [AzkarViewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AzkarViewFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var zekr: Zekr? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            zekr = it.getSerializable(ZEKR_PARAM) as Zekr
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_azkar_view, container, false)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AzkarViewFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(zekr: Zekr) =
                AzkarViewFragment().apply {
                    arguments = Bundle().apply {
                        putSerializable(ZEKR_PARAM, zekr)
                    }
                }
    }
}
