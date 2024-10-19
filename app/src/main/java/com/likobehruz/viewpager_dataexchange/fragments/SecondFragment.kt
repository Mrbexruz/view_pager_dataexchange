package com.likobehruz.viewpager_dataexchange.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.likobehruz.viewpager_dataexchange.R
import com.likobehruz.viewpager_dataexchange.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)


        return binding.root
    }


}