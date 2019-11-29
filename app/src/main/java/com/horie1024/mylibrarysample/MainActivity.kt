package com.horie1024.mylibrarysample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.horie1024.mylibrary.Hello
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello_world.text = Hello.world("Horie1024")
    }
}
