package com.jd.easypreferences


import android.content.Context
import android.content.SharedPreferences

class EasyPreferences(context: Context) {

    private val TAG = "EasyPreferences"


    private var sharedPreferences: SharedPreferences
    private var editor: SharedPreferences.Editor

    private val DEFAULT_PREF_MODE = 0
    private var DEFUALT_PREF_NAME = context.packageName

    private var prefMode: Int = DEFAULT_PREF_MODE
    private var prefName: String = DEFUALT_PREF_NAME


    init {
        sharedPreferences = context.getSharedPreferences(prefName, prefMode)
        editor = sharedPreferences.edit()
    }

    fun putString(key: String, value: String) {
        editor.putString(key, value)
        editor.commit()
    }


    fun getString(key: String, defaultValue: String): String =
        sharedPreferences.getString(key, defaultValue) ?: defaultValue


    fun putFloat(key: String, value: Float) {
        editor.putFloat(key, value)
        editor.commit()
    }


    fun getFloat(key: String, defaultValue: Float): Float =
        sharedPreferences.getFloat(key, defaultValue) ?: defaultValue


    fun putInt(key: String, value: Int) {
        editor.putInt(key, value)
        editor.commit()
    }


    fun getInt(key: String, defaultValue: Int): Int =
        sharedPreferences.getInt(key, defaultValue) ?: defaultValue


    fun putBoolean(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.commit()
    }


    fun getBoolean(key: String, defaultValue: Boolean): Boolean =
        sharedPreferences.getBoolean(key, defaultValue) ?: defaultValue


    fun putLong(key: String, value: Long) {
        editor.putLong(key, value)
        editor.commit()
    }


    fun getLong(key: String, defaultValue: Long): Long =
        sharedPreferences.getLong(key, defaultValue) ?: defaultValue


    fun putStringSet(key: String, value: Set<String>) {
        editor.putStringSet(key, value)
        editor.commit()
    }


    fun getStringSet(key: String, defaultValue: Set<String>): Set<String> =
        sharedPreferences.getStringSet(key, defaultValue) ?: defaultValue


    fun putValue(key: String, value: Any) {

        when (value) {
            is String -> {
                putString(
                    key,
                    value
                )
            }
            is Float -> {
                putFloat(
                    key,
                    value
                )
            }

            is Int -> {
                putInt(
                    key,
                    value
                )
            }

            is Boolean -> {
                putBoolean(
                    key,
                    value
                )
            }
            is Long -> {
                putLong(
                    key,
                    value
                )
            }
            is Set<*> -> {
                putStringSet(
                    key,
                    value as Set<String>
                )
            }
        }
    }

    fun getValue(key: String, defaultValue: Any): Any {

        return when (defaultValue) {
            is String -> {
                getString(
                    key,
                    defaultValue
                )
            }
            is Float -> {
                getFloat(
                    key,
                    defaultValue
                )
            }

            is Int -> {
                getInt(
                    key,
                    defaultValue
                )
            }

            is Boolean -> {
                getBoolean(
                    key,
                    defaultValue
                )
            }
            is Long -> {
                getLong(
                    key,
                    defaultValue
                )
            }
            is Set<*> -> {
                getStringSet(
                    key,
                    defaultValue as Set<String>
                )
            }

            else -> {
                // Error
            }
        }
    }

    fun removeAll() = editor.clear().commit()


    fun contain(key: String) = sharedPreferences.contains(key)
}