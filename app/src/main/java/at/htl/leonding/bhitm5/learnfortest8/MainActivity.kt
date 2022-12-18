package at.htl.leonding.bhitm5.learnfortest8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_container, HomeFragment()).commit()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_container, AboutFragment()).commit()
            }
            R.id.item2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_container, HomeFragment()).commit()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
