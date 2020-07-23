package com.padcmyanmr.padcgradlesample

import android.os.Bundle
import com.padcmyanmr.shared.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHello.text = BuildConfig.MY_ACCOUNT
    }
}