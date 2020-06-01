package com.example.parayo2.intro

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.parayo2.api.ParayoApi
import kotlinx.coroutines.runBlocking
import org.jetbrains.anko.setContentView
import java.lang.Exception


class IntroActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = IntroActivityUI()
        ui.setContentView(this)

        runBlocking {
            try{
                val response = ParayoApi.instance.hello()
                Log.d("IntroActivity", response.data)
            } catch(e: Exception) {
                Log.e("IntroActivity", "Hello API 호출 오류", e)
            }
        }


    }

}