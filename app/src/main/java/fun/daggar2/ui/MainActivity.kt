package `fun`.daggar2.ui

import `fun`.daggar2.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.big_container, MainFragment.newInstance())
            .commit()
    }
}
