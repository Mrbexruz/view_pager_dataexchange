package com.likobehruz.viewpager_dataexchange

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.PagerAdapter
import com.likobehruz.viewpager_dataexchange.adapters.MyFragmentAdapter
import com.likobehruz.viewpager_dataexchange.databinding.ActivityMainBinding
import com.likobehruz.viewpager_dataexchange.utils.MyData

class MainActivity : AppCompatActivity() {
    lateinit var myFragmentAdapter: MyFragmentAdapter
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.viewPager.adapter=  MyFragmentAdapter(supportFragmentManager)

    }
}