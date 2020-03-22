package com.anil.playground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun nextButtonClicked(view: View){
        var skillIntent = Intent(this, SkillSelectionActivity::class.java)
        startActivity(skillIntent)
    }
}
