package com.tpc.nudj.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface ScreenRoute : NavKey {

    @Serializable
    sealed interface Auth : ScreenRoute

    @Serializable
    sealed interface App : ScreenRoute {
        @Serializable
        data object DemoScreen : App
    }
}