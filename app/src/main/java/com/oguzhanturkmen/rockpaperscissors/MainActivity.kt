package com.oguzhanturkmen.rockpaperscissors

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun kagidaTiklandi(view: View) {
        val secim = Random.nextInt(3)
        when (secim) {
            0 -> rakipSecimText.text = "Rakip Taş Seçti!"
            1 -> rakipSecimText.text = "Rakip Kağıt Seçti!"
            2 -> rakipSecimText.text = "Rakip Makas Seçti"
        }
        oyuncuSecimText.text = "Kağıt Seçildi!"

        when (secim) {
            0 -> sonucText.text = "Kazandın!"
            1 -> sonucText.text = "Berabere!"
            2 -> sonucText.text = "Kaybettin"
        }
    }


    fun makasaTiklandi(view: View) {
        val secim = Random.nextInt(3)
        when (secim) {
            0 -> rakipSecimText.text = "Rakip Taş Seçti!"
            1 -> rakipSecimText.text = "Rakip Kağıt Seçti!"
            2 -> rakipSecimText.text = "Rakip Makas Seçti"
        }
        oyuncuSecimText.text = "Makas Seçildi!"

        when (secim) {
            0 -> sonucText.text = "Kaybettin!"
            1 -> sonucText.text = "Kazandın!"
            2 -> sonucText.text = "Berabere!"
        }

    }

    fun tasaTiklandi(view: View) {
        val secim = Random.nextInt(3)
        when (secim) {
            0 -> rakipSecimText.text = "Rakip Taş Seçti!"
            1 -> rakipSecimText.text = "Rakip Kağıt Seçti!"
            2 -> rakipSecimText.text = "Rakip Makas Seçti"
        }
        oyuncuSecimText.text = "Taş Seçildi!"

        when (secim) {
            0 -> sonucText.text = "Berabere!"
            1 -> sonucText.text = "Kaybettin!"
            2 -> sonucText.text = "Kazandın!"
        }
    }
}



