package com.likobehruz.viewpager_dataexchange.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import com.likobehruz.viewpager_dataexchange.R
import com.likobehruz.viewpager_dataexchange.databinding.FragmentFirstBinding
import com.likobehruz.viewpager_dataexchange.utils.MyData


class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        binding.edtFirst.addTextChangedListener {
            MyData.matn = it .toString()
        }
        return binding.root

    }



}