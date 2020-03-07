package com.example.nike.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nike.Model.Nike
import com.example.nike.R
import kotlinx.android.synthetic.main.nike_item.view.*

class Nike_Adapter (var nike_list:ArrayList<Nike>): RecyclerView.Adapter<Nike_Adapter.NikeViewHolder>(){
    inner class NikeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindNike(nike:Nike){
            itemView.txt_code.text=nike.code
            itemView.item_img.setImageResource(nike.Image)
            itemView.txt_name.text=nike.Name
            itemView.txt_model.text=nike.Model
            itemView.txt_price.text=nike.Price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NikeViewHolder {
            return NikeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.nike_item,parent,false))
    }

    override fun getItemCount(): Int {
            return nike_list.size
    }

    override fun onBindViewHolder(holder: NikeViewHolder, position: Int) {
            holder.bindNike(nike_list[position])
    }

}