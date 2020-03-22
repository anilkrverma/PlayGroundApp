package com.anil.playground.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.playground.Model.Player
import com.anil.playground.R
import com.anil.playground.Utils.EXTRA_GROUP
import com.anil.playground.Utils.EXTRA_LEVEL
import com.anil.playground.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

//        var group = intent.getStringExtra(EXTRA_GROUP)
//        var level = intent.getStringExtra(EXTRA_LEVEL)
        var player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        finalText.text = "Looking for ${player.group} groups with level as ${player.level} near your area"
    }
}
