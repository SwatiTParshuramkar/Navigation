package com.example.android.navigation

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.android.navigation.Activity.LogInActivity
import com.example.android.navigation.Fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var currentFragment: Fragment
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView = findViewById(R.id.navigationView)

        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_first -> {
                    replaceFragment(FirstFragment(), null)
                }
                R.id.nav_second -> {
                    replaceFragment(SecondFragment(), null)
                }
                R.id.nav_third -> {
                    replaceFragment(ThirdFragment(), null)
                }
                R.id.nav_fourth -> {
                    replaceFragment(FourthFragment(), null)
                }
                R.id.nav_fifth -> {
                    replaceFragment(SettingFragment(), null)
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true

        }
        replaceFragment(FirstFragment(), null)

    }



    fun replaceFragment(setFragment: Fragment, bundle: Bundle?){
        currentFragment = setFragment

        val fragmentManager = supportFragmentManager
        if(bundle != null){
            setFragment.arguments = bundle
        }
        val fragmentTra = fragmentManager.beginTransaction().addToBackStack(null)
        fragmentTra.replace(R.id.container, setFragment)
        fragmentTra.commit()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
         return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId) {
            R.id.action_profile -> {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.action_share ->{
                Toast.makeText(this,"Share",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_logout ->{
                val intent = Intent(this,LogInActivity::class.java)
                startActivity(intent)
                return true
            }
            else ->super.onOptionsItemSelected(item)
        }
     }
//        if (actionBarDrawerToggle.onOptionsItemSelected(item) ) {
//            return true
//        }
//        return super.onOptionsItemSelected(item)
//    }


}
