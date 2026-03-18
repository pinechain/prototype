package com.pinechain.prototype.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pinechain.prototype.presentation.feature1.Feature1Screen
import com.pinechain.prototype.presentation.feature2.Feature2Screen

@Composable
fun MainNavigator(
    modifier: Modifier = Modifier,
) {
    // Backstack management
    val backStack = rememberNavBackStack(Key1)
    val returnToPreviousScreen: () -> Unit = { backStack.removeLastOrNull() }
    val goToScreen: (key: NavKey) -> Unit = { key -> backStack += key }

    NavDisplay(
        backStack = backStack,
        onBack = returnToPreviousScreen,
        entryProvider = { key ->
            when (key) {
                is Key1 -> NavEntry(key) { Feature1Screen(advanceToFeature2 = { goToScreen(Key2) }) }
                is Key2 -> NavEntry(key) { Feature2Screen(advanceToFeature1 = { goToScreen(Key1) }) }
                else -> NavEntry(key) { Text("Error: Screen not found") }
            }
        }
    )
}