package com.anil.playground.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.anil.playground.Utils.EXTRA_GROUP
import com.anil.playground.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedGroup = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun mensBtnClicked(view: View) {
        womensBtn.isChecked = false
        allBtn.isChecked = false
        selectedGroup = "mens"
    }

    fun womensBtnClicked(view: View) {
        mensBtn.isChecked = false
        allBtn.isChecked = false
        selectedGroup = "womens"
    }

    fun allBtnClicked(view: View) {
        womensBtn.isChecked = false
        mensBtn.isChecked = false
        selectedGroup = "all"
    }

    fun nextButtonClicked(view: View) {
        if (selectedGroup != "") {
            var skillIntent = Intent(this, SkillSelectionActivity::class.java)
            skillIntent.putExtra(EXTRA_GROUP, selectedGroup)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select league", Toast.LENGTH_SHORT).show()
        }

    }
}
