package com.likobehruz.viewpager_dataexchange.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.likobehruz.viewpager_dataexchange.R
import com.likobehruz.viewpager_dataexchange.databinding.FragmentThirdBinding
import com.likobehruz.viewpager_dataexchange.utils.MyData


class ThirdFragment : Fragment() {
   lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        binding.tv3.text = MyData.matn
        return binding.root

    }


}