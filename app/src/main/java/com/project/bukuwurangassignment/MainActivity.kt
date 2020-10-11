package com.project.bukuwurangassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.project.bukuwurangassignment.home.HomeFragment
import com.project.bukuwurangassignment.profile.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNavigationView()

    }

    private fun setupBottomNavigationView() {

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            val fragment = when (item.itemId) {
                R.id.homeFragment -> {
                    HomeFragment()
                }
                R.id.profileFragment -> {
                    ProfileFragment()
                }
                else -> null
            }

            fragment?.let {
                changeFragment(fragment, fragment.javaClass.simpleName)
                return@setOnNavigationItemSelectedListener true
            } ?: kotlin.run {
                return@setOnNavigationItemSelectedListener false
            }
        }
    }

    private fun changeFragment(
            fragment: Fragment,
            tagFragmentName: String
    ) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val currentFragment: Fragment? = supportFragmentManager.primaryNavigationFragment

        if (currentFragment != null) fragmentTransaction.hide(currentFragment)

        var fragmentTemp: Fragment? =
                supportFragmentManager.findFragmentByTag(tagFragmentName)

        if (fragmentTemp == null) {
            fragmentTemp = fragment
            fragmentTransaction.add(R.id.homeContainer, fragmentTemp, tagFragmentName)
        } else {
            fragmentTransaction.show(fragmentTemp)
        }

        fragmentTransaction.setPrimaryNavigationFragment(fragmentTemp)
        fragmentTransaction.setReorderingAllowed(true)
        fragmentTransaction.commitNowAllowingStateLoss()
    }
}