package sample.kouta.original


import android.support.v7.app.AppCompatActivity
import android.widget.VideoView
import android.os.Bundle
import android.net.Uri
import android.widget.MediaController



class Main1_1 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1_1)

        val v = findViewById(R.id.videoView) as VideoView
        v.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.lastnumber_mp4))
        Thread.sleep(1000)
        v.start()
        v.setMediaController(MediaController(this))
    }


}
