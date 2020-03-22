package com.anil.playground.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Toast
import com.anil.playground.Model.Player
import com.anil.playground.Utils.EXTRA_GROUP
import com.anil.playground.R
import com.anil.playground.Utils.EXTRA_LEVEL
import com.anil.playground.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill_selection.*

class SkillSelectionActivity : BaseActivity() {

//    var groupSelected = ""
//    var level = ""

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_selection)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

        println(player.group)
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
