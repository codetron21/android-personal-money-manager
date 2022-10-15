package com.codetron.personalmoneymanagerapp.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColors(
    primary = PrimaryColor,
    primaryVariant = PrimaryDarkColor,
    secondary = AccentColor,
    surface = SurfaceColor,
    onSurface = PrimaryDarkVariantColor,
    background = Color.White,
    onBackground = PrimaryDarkVariantColor
)

object PersonalMoneyManagerTextStyle {
    val black80Alpha = Black80AlphaColor
}

@Composable
fun PersonalMoneyManagerAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}