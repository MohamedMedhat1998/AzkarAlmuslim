package com.g_developer.azkar_almuslim.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.g_developer.azkar_almuslim.R
import com.g_developer.azkar_almuslim.data.data_models.Azkar
import com.g_developer.azkar_almuslim.data.data_models.Zekr
import com.g_developer.azkar_almuslim.listeners.AzkarAdapterClickListener
import kotlinx.android.synthetic.main.item_zekr.view.*

class AzkarAdapter(private val data: List<Azkar>) : RecyclerView.Adapter<AzkarAdapter.AzkarHolder>() {

    lateinit var clickListener: AzkarAdapterClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AzkarHolder {
        return AzkarHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_zekr, parent, false))
    }

    override fun onBindViewHolder(holder: AzkarHolder, position: Int) {
        holder.tvName.text = data[position].title
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class AzkarHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = itemView.tvName
        val ivPlay: ImageView = itemView.ivPlay
        val ivFavorite: ImageView = itemView.ivFavorite

        init {
            if (::clickListener.isInitialized) {
                itemView.setOnClickListener {
                    clickListener.onItemClicked(data[adapterPosition])
                }
                ivPlay.setOnClickListener {
                    clickListener.onPlayClicked(data[adapterPosition])
                }
                ivFavorite.setOnClickListener {
                    clickListener.onFavoriteClicked(data[adapterPosition])
                }
            }
        }
    }
}