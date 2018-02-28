package sample.kouta.original

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Music=findViewById(R.id.music) as Button

        Music.setOnClickListener{
            startActivity(Intent(this, Main1::class.java))
        }
    }

}
