package com.anil.playground.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.anil.playground.model.Player
import com.anil.playground.R
import com.anil.playground.utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill_selection.*

class SkillSelectionActivity : BaseActivity() {

//    var groupSelected = ""
//    var level = ""

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_selection)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

        println(player.group)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }

    fun onExpertBtnClicked(view: View){
        beginnerBtn.isChecked = false
        player.level = "Expert"
    }

    fun onBeginnerBtnClicked(view: View){
        expertBtn.isChecked = false
        player.level = "Beginner"
    }

    fun onFinishBtnClicked(view: View){
        if (player.level != ""){
            var finishIntent = Intent(this, FinalActivity::class.java)
//            finishIntent.putExtra(EXTRA_GROUP, groupSelected)
//            finishIntent.putExtra(EXTRA_LEVEL, level)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)

        } else{
            Toast.makeText(this, "Please select level", Toast.LENGTH_LONG).show()
        }

    }


}
