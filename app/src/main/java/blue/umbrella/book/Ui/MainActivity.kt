package blue.umbrella.book.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import blue.umbrella.book.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.hide()

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_nav)
        val navController = findNavController(R.id.fragment_container)

        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.homeFragment,
            R.id.searchFragment,
            R.id.libraryFragment,
            R.id.bookMarkFragment,
            R.id.menuFragment,
        ))

        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)

    }

}