package sample.kouta.original

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_1.*
import android.media.MediaPlayer


open class Main1 : AppCompatActivity() {

    var mp:MediaPlayer?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        var intent: Intent = Intent(this, Main2::class.java)

        music1.setOnClickListener() {
         //   mp = MediaPlayer.create(applicationContext, R.raw.under)
            intent.putExtra("MUSIC",1)
            startActivity(intent)
        }

        music2.setOnClickListener() {
         //   mp = MediaPlayer.create(applicationContext, R.raw.mythings)
            intent.putExtra("MUSIC",2)
            startActivity(intent)
        }
    }

}
