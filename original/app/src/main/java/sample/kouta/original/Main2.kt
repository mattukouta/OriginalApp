package sample.kouta.original

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_2.*
import android.media.MediaPlayer


class Main2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var mp:MediaPlayer?=null
        var MP=intent.getStringExtra("MUSIC")
        var sing=""

        if(MP=="1"){
            mp = MediaPlayer.create(applicationContext, R.raw.under)
            sing="under"
        }else if(MP=="2"){
            mp = MediaPlayer.create(applicationContext, R.raw.mythings)
            sing="mythings"
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