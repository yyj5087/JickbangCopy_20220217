package com.nepplus.jickbangcopy_20220217.adarpters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.jickbangcopy_20220217.R
import com.nepplus.jickbangcopy_20220217.datas.JickbangData
import kotlinx.android.synthetic.main.room_list_item.view.*

class JickbangAdapter(

    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<JickbangData>
): ArrayAdapter<JickbangData>(mContext, resId, mList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var temp = convertView
        if(temp == null){
            temp = LayoutInflater.from(mContext).inflate(R.layout.room_list_item,null)
        }
        val row = temp!!

        return row



    }
}