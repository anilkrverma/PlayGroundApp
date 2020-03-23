package com.anil.playground.controller

import android.content.Intent
import android.os.Bundle
import com.anil.playground.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {
            var leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)

        }
    }
}
