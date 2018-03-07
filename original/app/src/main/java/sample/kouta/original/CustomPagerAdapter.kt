package sample.kouta.original

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast


class CustomPagerAdapter(val context: Context, val images: IntArray) : PagerAdapter() {

    internal var layoutInflater: LayoutInflater

    init {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int = images.size

    override fun isViewFromObject(view: View?, `object`: Any?): Boolean {
        return view == `object`
    }



    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemView = layoutInflater.inflate(R.layout.item_view_pager, container, false)

        val imageView = itemView.findViewById(R.id.image_view) as ImageView
        imageView.setImageResource(images[position])

        container.addView(itemView)

        //listening to image click
        imageView.setOnClickListener { Toast.makeText(context, "you clicked image " + (position + 1), Toast.LENGTH_LONG).show() }

        return itemView
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        container?.removeView(`object` as LinearLayout)
    }
}
