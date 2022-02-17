package com.nepplus.jickbangcopy_20220217.adarpters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.jickbangcopy_20220217.datas.JickbangData

class JickbangAdapter(

    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<JickbangData>
): ArrayAdapter<JickbangData>(mContext, resId, mList) {
}