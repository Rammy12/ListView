package com.example.list_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
const val KEY_1="name"
const val KEY_2="country"
const val KEY_3="phone"
const val KEY_4="imageId"
class MainActivity : AppCompatActivity() {
    private lateinit var userArraylist:ArrayList<user>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageId= intArrayOf(R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e
        ,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l)
        val name= arrayOf(
            "Ramesh",
            "Ravi",
            "Chandran",
            "Darsh",
            "Darpan",
            "Ekansh",
            "Evak",
            "Girik",
            "Aadhya",
            "Aanya",
            "Aarna",
            "Advika"

        )
        val lasttime= arrayOf(
            "8:45pm",
            "7:56pm",
            "8:26pm",
            "7:66pm",
            "9:06pm",
            "4:50pm",
            "7:56pm",
            "7:56pm",
            "7:56pm",
            "7:56pm",
            "7:56pm",
            "7:56pm")
        val lastmsg= arrayOf(
            "hiii",
            "no",
            "yess!",
            "i am busy",
            "okkk",
            "heyy",
            "hiii",
            "no",
            "yess!",
            "i am busy",
            "okkk",
            "heyy")
        val phoneNo= arrayOf(
            "2025550195",
            "2025550126",
            "2025550192",
            "2025550197",
            "2025550139",
            "2025550197",
            "3859699000",
            "3859840109",
            "3852220591",
            "3857316644",
            "3853256986",
            "3852087436"
        )
        val country= arrayOf(
            "India",
            "Albania",
            "Andorra",
            "Argentina",
            "Australia",
            "Bhutan",
            "India",
            "Albania",
            "Andorra",
            "Argentina",
            "Australia",
            "Bhutan")
        userArraylist=ArrayList()
        for(i in name.indices)
        {
            val User=user(name[i],lastmsg[i],phoneNo[i],country[i],imageId[i],lasttime[i])
            userArraylist.add(User)
        }
        listview.isClickable=true
        listview.adapter=Adepter(this,userArraylist)
        listview.setOnItemClickListener { parent, view, position, id ->
            val name=name[position]
            val phone=phoneNo[position]
            val country=country[position]
            val imageId=imageId[position]
            val i=Intent(this,user_profile::class.java)
            i.putExtra(KEY_1,name)
            i.putExtra(KEY_2,phone)
            i.putExtra(KEY_3,country)
            i.putExtra(KEY_4,imageId)
            startActivity(i)
        }
    }
}
