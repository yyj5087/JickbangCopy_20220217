package com.nepplus.jickbangcopy_20220217

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20220217.adarpters.JickbangAdapter
import com.nepplus.jickbangcopy_20220217.datas.JickbangData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: JickbangAdapter
    val mRoomList = ArrayList<JickbangData>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(JickbangData(8000,"서울시 동대문구", 7, "1번째 방입니다."))
        mRoomList.add(JickbangData(19000,"서울시 서대문구", 5, "2번째 방입니다."))
        mRoomList.add(JickbangData(25600,"서울시 동작구", 3, "3번째 방입니다."))
        mRoomList.add(JickbangData(5000,"서울시 강남구", -2, "4번째 방입니다."))
        mRoomList.add(JickbangData(6500,"서울시 은평구", -1, "5번째 방입니다."))
        mRoomList.add(JickbangData(8000,"서울시 마포구", 10, "6번째 방입니다."))
        mRoomList.add(JickbangData(7800,"서울시 중랑구", 13, "7번째 방입니다."))
        mRoomList.add(JickbangData(35600,"서울시 성북구", 4, "8번째 방입니다."))
        mRoomList.add(JickbangData(9600,"서울시 성동구", 2, "9번째 방입니다."))
        mRoomList.add(JickbangData(11000,"고양시 일산동구", 1, "10번째 방입니다."))

        mAdapter = JickbangAdapter(this,R.layout.room_list_item,mRoomList)
        roomListView.adapter = mAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->
            val clickRoom = mRoomList[position]
            val myIntent = Intent(this,ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo",clickRoom)
            startActivity(myIntent)
        }


    }
}