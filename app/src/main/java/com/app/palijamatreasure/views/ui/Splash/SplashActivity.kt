package com.app.palijamatreasure.views.ui.Splash

//import android.R
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.app.palijamatreasure.MainActivity
import com.app.palijamatreasure.R
import com.app.palijamatreasure.views.ui.Login.LoginActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val mainIntent = Intent(this, LoginActivity::class.java)
            this.startActivity(mainIntent)
            this.finish()
            overridePendingTransition(R.anim.slide_left_to_right, R.anim.slide_left_to_right)
        }, 6000)

    }
}