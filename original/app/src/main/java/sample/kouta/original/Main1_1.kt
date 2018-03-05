package sample.kouta.original

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.widget.MediaController
import android.widget.VideoView

class Main1_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1_1)


        // ビデオビューの生成
//        videoView = findViewById(R.id.videoView) as VideoView
//        videoView!!.requestFocus()
//        videoView!!.setVideoURI(Uri.parse(url))
//        videoView!!.setMediaController(MediaController(this))
//
//        // 動画の再生
//        videoView!!.start()

        val v = findViewById(R.id.videoView) as VideoView

        v.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.lastnumber_mp4))

        Thread.sleep(1000)

        v.start()

        v.setMediaController(MediaController(this))
    }
}
