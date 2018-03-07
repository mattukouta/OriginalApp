package sample.kouta.original


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v4.view.ViewPager

class Main1_2 : AppCompatActivity() {

    internal var viewPager:ViewPager?=null
    internal var images = intArrayOf(R.drawable.fruit_yuzu, R.drawable.bear, R.drawable.tk)
    internal var myCustomPagerAdapter: CustomPagerAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1_2)
        Thread.sleep(1000)
        viewPager = findViewById(R.id.view_pager) as ViewPager
        Thread.sleep(1000)
        myCustomPagerAdapter = CustomPagerAdapter(this, images)
        Thread.sleep(1000)
        viewPager.setAdapter(myCustomPagerAdapter)
    }
}