package com.github.emrah.wllstr.typesafenav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.createGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.fragment

class MainActivity : AppCompatActivity() {

    private val navController: NavController
        get() {
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            return navHostFragment.navController
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController.graph = navController.createGraph(startDestination = Routes.A){
            fragment<AFragment, Routes.A> {

            }

            fragment<BFragment, Routes.B> {

            }
            fragment<CFragment, Routes.C> {

            }
        }
    }
}
