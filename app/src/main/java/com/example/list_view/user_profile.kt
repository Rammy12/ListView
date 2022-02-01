package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_profile.*

class user_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)
        val Name=intent.getStringExtra(KEY_1)
        val phone_no=intent.getStringExtra(KEY_2)
        val Country=intent.getStringExtra(KEY_3)
        val image=intent.getIntExtra(KEY_4,R.drawable.a)
        img.setImageResource(image)
        n_ame.text=Name
        phone_n.text=phone_no
        country.text=Country
    }
}