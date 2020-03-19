package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.setOnClickListener{

            val animation = AnimationUtils.loadAnimation(this,R.anim.test)

            imageView.startAnimation(animation)

        }

        imageView2.setOnClickListener{

            val animation = AnimationUtils.loadAnimation(this,R.anim.test2)

            imageView2.startAnimation(animation)

        }

        imageView3.setOnClickListener{

            val animation = AnimationUtils.loadAnimation(this,R.anim.test3)

            imageView3.startAnimation(animation)

        }

        imageView4.setOnClickListener{

            val animation = AnimationUtils.loadAnimation(this,R.anim.test4)

            imageView4.startAnimation(animation)

        }

        imageView5.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this,R.anim.test5)

            imageView5.startAnimation(animation)
        }

        imageView6.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this,R.anim.test6)

            imageView6.startAnimation(animation)


        }

        imageView7.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this,R.anim.test7)

            imageView7.startAnimation(animation)


        }

        imageView8.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this,R.anim.test8)

            imageView8.startAnimation(animation)


        }


    }
}
