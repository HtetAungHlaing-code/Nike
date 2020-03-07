package com.example.nike.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.nike.Adapter.Nike_Adapter
import com.example.nike.Model.Nike
import com.example.nike.R
import kotlinx.android.synthetic.main.fragment_nike_.view.*

/**
 * A simple [Fragment] subclass.
 */
class Nike_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var NikeArray=ArrayList<Nike>()
        NikeArray.add(Nike("001",R.drawable.one,"Nike Superfly 6","Elite FG",799))
        NikeArray.add(Nike("002",R.drawable.two,"Nike Air","Vapormax",1280))
        NikeArray.add(Nike("003",R.drawable.three,"Air Jordan 14","Sport",2400))
        NikeArray.add(Nike("004",R.drawable.four,"Lebron XVI","Low EP",1100))
        NikeArray.add(Nike("005",R.drawable.five,"Jordan Sport","Zero",2700))
        NikeArray.add(Nike("006",R.drawable.six,"Lebron XI","SB EP",1080))
        var nikeAdapter=Nike_Adapter(NikeArray)
        var root=inflater.inflate(R.layout.fragment_nike_, container, false)
        root.recyclerView.layoutManager= GridLayoutManager(context,2)
        root.recyclerView.adapter=nikeAdapter
        // Inflate the layout for this fragment
        return root
    }

}
