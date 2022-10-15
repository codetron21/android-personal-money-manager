package com.codetron.personalmoneymanagerapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codetron.personalmoneymanagerapp.R
import com.codetron.personalmoneymanagerapp.ui.theme.PersonalMoneyManagerAppTheme
import com.codetron.personalmoneymanagerapp.ui.theme.PersonalMoneyManagerTextStyle

@Composable
fun SplashScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Box(
            modifier = Modifier.padding(16.dp)
        ) {
            AppBrand(modifier = Modifier.align(Alignment.Center))
            AppVersion(modifier = Modifier.align(Alignment.BottomCenter))
        }
    }

}

@Composable
@Preview(name = "App Brand", showBackground = true)
private fun AppBrand(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_wallet),
            contentDescription = null,
            modifier = Modifier
                .size(180.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(color = MaterialTheme.colors.background)
                .padding(24.dp),
        )

        Text(
            text = stringResource(id = R.string.splash_brand_name),
            style = MaterialTheme.typography.h1,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
@Preview(name = "App Version", showBackground = true)
private fun AppVersion(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.app_version),
        color = PersonalMoneyManagerTextStyle.black80Alpha,
        modifier = modifier
    )
}

@Composable
@Preview(name = "Splash Screen", showBackground = true)
private fun SplashScreen_Preview() {
    PersonalMoneyManagerAppTheme {
        SplashScreen()
    }
}