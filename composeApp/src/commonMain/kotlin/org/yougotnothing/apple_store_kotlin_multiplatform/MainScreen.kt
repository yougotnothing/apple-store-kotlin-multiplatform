package org.yougotnothing.apple_store_kotlin_multiplatform

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import applestorekotlinmultiplatform.composeapp.generated.resources.Res
import applestorekotlinmultiplatform.composeapp.generated.resources.mac_mini_m4
import org.yougotnothing.apple_store_kotlin_multiplatform.data.Products
import org.jetbrains.compose.resources.stringResource

@Composable
fun MainAppBar(
    modifier: Modifier = Modifier,
    currentScreen: Products = Products.MacMiniM4,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
               IconButton(onClick = navigateUp) {
                   Icon(
                       imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                       contentDescription = stringResource(Res.string.mac_mini_m4)
                   )
               }
            }
        }
    )
}

@Composable
fun MainApp() {
    Scaffold {
        MainAppBar(canNavigateBack = false, navigateUp = {})
        Column { Text(text = "MainAppScreen") }
    }
}