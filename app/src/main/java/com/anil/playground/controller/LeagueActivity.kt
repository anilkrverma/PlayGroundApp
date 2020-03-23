package com.anil.playground.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.anil.playground.model.Player
import com.anil.playground.R
import com.anil.playground.utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

//    var selectedGroup = ""

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun mensBtnClicked(view: View) {
        womensBtn.isChecked = false
        allBtn.isChecked = false
        player.group = "mens"
    }

    fun womensBtnClicked(view: View) {
        mensBtn.isChecked = false
        allBtn.isChecked = false
        player.group = "womens"
    }

    fun allBtnClicked(view: View) {
        womensBtn.isChecked = false
        mensBtn.isChecked = false
        player.group = "all"
    }

    fun nextButtonClicked(view: View) {
        if (player.group != "") {
            var skillIntent = Intent(this, SkillSelectionActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select league", Toast.LENGTH_SHORT).show()
        }

    }
}
