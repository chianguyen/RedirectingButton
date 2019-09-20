package org.mp.redirectingbutton

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_cal.setOnClickListener(View.OnClickListener {
            var myIntent = Intent(Intent.makeMainSelectorActivity(
                Intent.ACTION_MAIN,
                Intent.CATEGORY_APP_CALCULATOR))
            startActivity(myIntent)
        })

        btn_map.setOnClickListener(View.OnClickListener {
            //var myIntent2 = Intent(Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, Intent.CATEGORY_APP_MAPS))
            var myIntent2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps"))
            startActivity(myIntent2)
        })
    }
}
