package com.anil.playground.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.playground.R
import com.anil.playground.Utils.EXTRA_GROUP
import com.anil.playground.Utils.EXTRA_LEVEL
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        var group = intent.getStringExtra(EXTRA_GROUP)
        var level = intent.getStringExtra(EXTRA_LEVEL)

        finalText.text = "Looking for $group groups with level as $level near your area"
    }
}
