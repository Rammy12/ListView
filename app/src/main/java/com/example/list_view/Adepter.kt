package com.example.list_view

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adepter(private var context:Activity,private var arraylist:ArrayList<user>) : ArrayAdapter<user>(
    context,R.layout.list_item,arraylist){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater :LayoutInflater= LayoutInflater.from(context)
        val view:View=inflater.inflate(R.layout.list_item,null)
        val imageView:ImageView=view.findViewById(R.id.imgprofile)
        val username:TextView=view.findViewById(R.id.p_name)
        val lastMsg:TextView=view.findViewById(R.id.lastmassage)
        val lastMsgtime:TextView=view.findViewById(R.id.time)
        //set the data
        imageView.setImageResource(arraylist[position].imageId)
        username.text=arraylist[position].name
        lastMsg.text=arraylist[position].lastmassage
        lastMsgtime.text=arraylist[position].lastMsgTime
        return view
    }
}