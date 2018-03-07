package sample.kouta.original

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_2.*
import android.media.MediaPlayer
import android.util.Log
import android.support.v4.view.ViewPager


class Main2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var mp:MediaPlayer?=null
        var MP=intent.extras.get("MUSIC")

        var sing="アンダー"

        if(MP.equals(1)){
            mp = MediaPlayer.create(applicationContext, R.raw.under)
            sing="アンダー"
        }else if(MP.equals(2)){
            mp = MediaPlayer.create(applicationContext, R.raw.mythings)
            sing="自分のこと"
        }else if(MP.equals(3)){
            mp = MediaPlayer.create(applicationContext, R.raw.lastnumber_mp3)
            sing="Last Number"
        }

        textView.text=sing


        start.setOnClickListener(){
            mp?.start()
        }

        one_stop.setOnClickListener(){
            mp?.pause()
        }

        stop.setOnClickListener(){
            mp?.stop()
            mp?.prepare()
        }

        back.setOnClickListener(){
            mp?.stop()
            startActivity(Intent(this, Main1::class.java))
        }
    }

}