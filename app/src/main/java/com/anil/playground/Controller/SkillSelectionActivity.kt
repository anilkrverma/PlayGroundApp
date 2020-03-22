package com.anil.playground.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Toast
import com.anil.playground.Utils.EXTRA_GROUP
import com.anil.playground.R
import com.anil.playground.Utils.EXTRA_LEVEL
import kotlinx.android.synthetic.main.activity_skill_selection.*

class SkillSelectionActivity : BaseActivity() {

    var groupSelected = ""

    var level = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_selection)
        groupSelected = intent.getStringExtra(EXTRA_GROUP)

        println(groupSelected)
    }

    fun onExpertBtnClicked(view: View){
        beginnerBtn.isChecked = false
        level = "Expert"
    }

    fun onBeginnerBtnClicked(view: View){
        expertBtn.isChecked = false
        level = "Beginner"
    }

    fun onFinishBtnClicked(view: View){
        if (level != ""){
            var finishIntent = Intent(this, FinalActivity::class.java)
            finishIntent.putExtra(EXTRA_GROUP, groupSelected)
            finishIntent.putExtra(EXTRA_LEVEL, level)
            startActivity(finishIntent)

        } else{
            Toast.makeText(this, "Please select level", Toast.LENGTH_LONG).show()
        }

    }


}
