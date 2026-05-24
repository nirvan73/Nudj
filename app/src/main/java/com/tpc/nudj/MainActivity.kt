package com.tpc.nudj

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.tpc.nudj.navigation.ScreenRoute
import com.tpc.nudj.ui.DemoScreen
import com.tpc.nudj.ui.DemoScreen2
import com.tpc.nudj.ui.theme.NudjTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NudjTheme {
                val backStack = rememberNavBackStack(ScreenRoute.App.DemoScreen)
                NavDisplay(
                    backStack = backStack,
                    entryProvider = entryProvider {
                        entry<ScreenRoute.App.DemoScreen> {
                            DemoScreen(
                                navigateToDemo2 = {
                                    backStack.add(ScreenRoute.App.DemoScreen2)
                                }
                            )
                        }
                    }
                )
            }
        }
    }
}