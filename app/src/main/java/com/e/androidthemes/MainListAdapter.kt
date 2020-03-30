package com.e.androidthemes

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Luana Marega on 2020-03-30;
 */
class MainListAdapter(val inflater: LayoutInflater): BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = inflater.inflate(R.layout.list_item, parent, false)
        var titleView = view.findViewById<TextView>(R.id.sampleTitle)
        var subTitleView = view.findViewById<TextView>(R.id.sampleSubtitle)
        var iconView = view.findViewById<ImageView>(R.id.icon)

        Log.d("Adapter","get view, position-> "+position);

        when(position){
            0 -> {
                titleView.text = "Light Theme"
                subTitleView.text = "Click to preview the light theme"
                iconView.setImageResource(R.drawable.ic_brightness)
            }
            1 -> {
                titleView.text = "Dark Theme"
                subTitleView.text = "Click to preview the dark theme"
                iconView.setImageResource(R.drawable.ic_brightness_low)
            }
        }

        return view
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return 2
    }
}