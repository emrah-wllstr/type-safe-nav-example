package com.github.emrah.wllstr.typesafenav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Column {
                    Text("A Fragment")
                    Button(onClick = {
                        findNavController().navigate(Routes.B) {
                            popUpTo(Routes.A) {
                                inclusive = true
                            }
                        }
                    }) {
                        Text("Go to B")
                    }
                    Button(onClick = {
                        findNavController().navigate(Routes.C) {
                            popUpTo(Routes.A) {
                                inclusive = true
                            }
                        }
                    }) {
                        Text("Go to C")
                    }
                }
            }
        }
    }
}