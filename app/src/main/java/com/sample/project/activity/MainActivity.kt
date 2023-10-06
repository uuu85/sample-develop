package com.sample.project.activity

import android.os.Bundle
import androidx.activity.viewModels
import com.sample.project.R
import com.sample.project.activity.base.BaseDataBindingActivity
import com.sample.project.databinding.ActivityMainBinding
import com.sample.project.viewModel.MainViewModel

class MainActivity: BaseDataBindingActivity<MainViewModel, ActivityMainBinding>(
    R.layout.activity_main
) {
    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}