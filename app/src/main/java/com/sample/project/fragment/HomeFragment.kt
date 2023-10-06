package com.sample.project.fragment

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sample.project.R
import com.sample.project.databinding.FragmentHomeBinding
import com.sample.project.fragment.base.BaseDataBindingFragment
import com.sample.project.viewModel.HomeViewModel

class HomeFragment: BaseDataBindingFragment<HomeViewModel, FragmentHomeBinding>(
    R.layout.fragment_home
) {
    override val viewModel: HomeViewModel by viewModels()

    override fun initView() {
        initListener()
    }

    private fun initListener() {
        binding.htmlBtn.setOnClickListener {
            findNavController().navigate(R.id.home_to_html_sample)
        }
    }
}