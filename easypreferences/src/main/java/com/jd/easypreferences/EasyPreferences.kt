package com.jd.easypreferences

import android.content.Context
import android.content.SharedPreferences

class EasyPreferences(context: Context, prefMode: Int, prefName: String) {
    private var sharedPreferences: SharedPreferences
    private var editor: SharedPreferences.Editor


    init {
        sharedPreferences = context.getSharedPreferences(prefName, prefMode)
        editor = sharedPreferences.edit()
    }

    private fun setString(key: String, value: String) {
        editor.putString(key, value)
    }

    private fun getString(key: String, defaultValue: String) {
        sharedPreferences.getString(key, defaultValue)
    }

}