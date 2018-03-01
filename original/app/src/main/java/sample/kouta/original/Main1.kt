package sample.kouta.original

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_1.*
import android.media.MediaPlayer


class Main1 : AppCompatActivity() {

    var mp:MediaPlayer?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        music1.setOnClickListener(){
            mp = MediaPlayer.create(applicationContext, R.raw.under)
            mp?.start()
        }

        music2.setOnClickListener(){
            mp = MediaPlayer.create(applicationContext, R.raw.mythings)
            mp?.start()
        }
    }

}
