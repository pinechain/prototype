package com.pinechain.prototype.presentation.feature1

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Feature1Screen(
    modifier: Modifier = Modifier,
    advanceToFeature2: () -> Unit,
) {
    Button(
        modifier = Modifier.padding(top = 50.dp),
        onClick = advanceToFeature2
    ) {
        Text("Feature 1 - Click for feature 2")
    }
}