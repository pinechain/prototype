package com.pinechain.prototype.presentation.feature2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Feature2Screen(
    modifier: Modifier = Modifier,
    advanceToFeature1: () -> Unit,
) {
    Button(
        modifier = Modifier.padding(top = 50.dp),
        onClick = advanceToFeature1
    ) {
        Text("Feature 2 - Click for feature 1")
    }
}