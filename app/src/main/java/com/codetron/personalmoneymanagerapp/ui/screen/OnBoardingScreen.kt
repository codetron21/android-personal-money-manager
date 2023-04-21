package com.codetron.personalmoneymanagerapp.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codetron.personalmoneymanagerapp.resources.OnBoardingRes
import com.codetron.personalmoneymanagerapp.ui.theme.GreyColor
import com.codetron.personalmoneymanagerapp.ui.theme.PersonalMoneyManagerAppTheme
import com.codetron.personalmoneymanagerapp.ui.views.OutlinedButtonView

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        val pageState = rememberPagerState()

        HorizontalPager(
            pageCount = OnBoardingRes.getResources().size,
            state = pageState,
        ) { index ->
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = OnBoardingRes.getResources()[index].image),
                    contentDescription = OnBoardingRes.getResources()[index].title,
                    modifier = Modifier.size(300.dp)
                        .align(Alignment.Center)
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(
                    MaterialTheme.colors.surface,
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                )
                .padding(16.dp)
                .align(Alignment.BottomCenter)
        ) {
            Text(
                text = OnBoardingRes.getResources()[pageState.currentPage].title,
                style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Bold),
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = OnBoardingRes.getResources()[pageState.currentPage].description,
                style = MaterialTheme.typography.body1,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            )

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                repeat(OnBoardingRes.getResources().size) { index ->
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 4.dp)
                            .size(16.dp)
                            .background(
                                color = if (pageState.currentPage == index) {
                                    MaterialTheme.colors.primaryVariant
                                } else {
                                    GreyColor
                                },
                                shape = CircleShape
                            )
                    )
                }
            }

        }

        OutlinedButtonView(
            onClick = {},
            label="Skip",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(16.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun OnBoardingScreen_Preview() {
    PersonalMoneyManagerAppTheme {
        OnBoardingScreen()
    }
}