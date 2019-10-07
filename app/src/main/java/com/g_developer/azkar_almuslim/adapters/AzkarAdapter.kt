package com.g_developer.azkar_almuslim.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.g_developer.azkar_almuslim.R
import com.g_developer.azkar_almuslim.data.data_models.Zekr
import kotlinx.android.synthetic.main.item_zekr.view.*

class AzkarAdapter(private val data: List<Zekr>) : RecyclerView.Adapter<AzkarAdapter.AzkarHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AzkarHolder {
        return AzkarHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_zekr, parent, false))
    }

    override fun onBindViewHolder(holder: AzkarHolder, position: Int) {
        holder.tvName.text = data[position].name
    }

    override fun getItemCount(): Int {
        Log.d("Adapter","${data.size}")
        return data.size
    }

    class AzkarHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = itemView.tvName
        val btnPlay: ImageView = itemView.ivPlay
        val btnFavorite: ImageView = itemView.ivFavorite
    }
}