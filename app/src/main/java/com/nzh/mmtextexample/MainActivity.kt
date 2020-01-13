package com.nzh.mmtextexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.myatminsoe.mdetect.MDetect
import me.myatminsoe.mdetect.MMTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        MDetect.init(this)

        setContentView(R.layout.activity_main)
        val tv = findViewById<MMTextView>(R.id.tv_main)

        tv.setMMText("ယူနီကုဒ်စနစ်ကိုအသုံးပြုထားပါသည်။")
        if (MDetect.isUnicode()){
            //user is using Unicode
            tv.text = "ယူနီကုဒ်စနစ်ကိုအသုံးပြုထားပါသည်။"
        } else {
            //user is using Zawgyi or showing squares
            tv.text = "ေဇာ္ဂ်ီစနစ္ကိုအသံုးျပဳထားပါသည္။"
        }
    }
}
