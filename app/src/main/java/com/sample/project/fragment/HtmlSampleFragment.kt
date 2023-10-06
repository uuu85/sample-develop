package com.sample.project.fragment

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sample.project.R
import com.sample.project.databinding.FragmentHtmlBinding
import com.sample.project.fragment.base.BaseDataBindingFragment
import com.sample.project.viewModel.HtmlSampleViewModel

class HtmlSampleFragment: BaseDataBindingFragment<HtmlSampleViewModel, FragmentHtmlBinding>(
    R.layout.fragment_html
) {
    override val viewModel: HtmlSampleViewModel by viewModels()

    override fun initView() {
        binding.plane.setOnClickListener {
            findNavController().navigate(R.id.html_to_plane)
        }

        binding.rich.setOnClickListener {
            findNavController().navigate(R.id.html_to_rich)
        }
    }
}