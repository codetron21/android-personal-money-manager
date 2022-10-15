package com.codetron.personalmoneymanagerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.codetron.personalmoneymanagerapp.ui.screen.SplashScreen
import com.codetron.personalmoneymanagerapp.ui.theme.PersonalMoneyManagerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalMoneyManagerAppTheme {
                SplashScreen()
            }
        }
    }
}