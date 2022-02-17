package com.nepplus.jickbangcopy_20220217

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20220217.datas.JickbangData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val jickbangData = intent.getSerializableExtra("roomInfo") as JickbangData

        txtprice.text = jickbangData.getFormattedPrice()
        txtDescription.text = jickbangData.description
        txtAddress.text = jickbangData.address
        txtFloor.text = jickbangData.getFormattedFloor()

    }
}