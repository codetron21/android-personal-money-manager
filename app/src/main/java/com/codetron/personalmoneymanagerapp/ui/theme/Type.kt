package com.codetron.personalmoneymanagerapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codetron.personalmoneymanagerapp.R

val RalewayFontFamily = FontFamily(
    Font(R.font.raleway_bold, weight = FontWeight.Bold),
    Font(R.font.raleway_light, weight = FontWeight.Light),
    Font(R.font.raleway_regular)
)

val QuestrialFontFamily = FontFamily(
    Font(R.font.questrial_regular)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = RalewayFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),

    h2 = TextStyle(
        fontFamily = RalewayFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),

    h3 = TextStyle(
        fontFamily = RalewayFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
    ),

    body1 = TextStyle(
        fontFamily = QuestrialFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)