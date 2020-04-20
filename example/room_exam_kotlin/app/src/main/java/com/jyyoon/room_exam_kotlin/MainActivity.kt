package com.jyyoon.room_exam_kotlin

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.jyyoon.room_exam_kotlin.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =  DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val viewModel: MainViewModel by viewModels()
        binding.lifecycleOwner = this //이거 안하면 livedata 관찰할때 xml이 refresh가 안됨
        binding.viewModel = viewModel
    }
}
