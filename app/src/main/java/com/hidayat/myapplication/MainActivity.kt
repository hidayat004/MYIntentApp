package com.hidayat.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.khoirudin.myapplication.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val IntentPindah = Intent(this@MainActivity, MoveActivity::class.java)
                val btnMoveActivityData = R.id.btn_move_activity_data
                startActivity(IntentPindah)

                {
                    val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                    moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Native Programming")
                    moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 20)
                    startActivity(moveWithDataIntent)

                    val btnMoveWithObject:Button = findViewById(R.id.btn_move_activity_object)
                    btnMoveWithObject.setOnClickListener(this)
                }
            }
        }
    }

    private fun startActivity(intentPindah: Intent, function: () -> Unit) {

    }
}





