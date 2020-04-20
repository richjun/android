package com.jyyoon.room_exam_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.jyyoon.room_exam_kotlin.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        val binding =  DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.lifecycleOwner = this //이거 안하면 livedata 관찰할때 xml이 refresh가 안됨
        binding.viewModel = viewModel
    }
}
