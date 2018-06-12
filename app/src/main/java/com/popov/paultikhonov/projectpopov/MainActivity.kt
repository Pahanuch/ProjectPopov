package com.popov.paultikhonov.projectpopov

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        bottomnav.onNavigationItemSelectedListener = mOnNavigationItemSelectedListener
        bottomnav1.onNavigationItemSelectedListener = mOnNavigationItemSelectedListener

        val adapter = SimpleFragmentPagerAdapter(this, supportFragmentManager)

        viewpager.adapter = adapter

        sliding_tabs.setupWithViewPager(viewpager)

        bottomnav.setTextVisibility(false)
        bottomnav1.setTextVisibility(false)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item!!.itemId

        return when (id) {
            R.id.action_settings -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home_normal -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_discover_2_active -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_message_normal -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

}
