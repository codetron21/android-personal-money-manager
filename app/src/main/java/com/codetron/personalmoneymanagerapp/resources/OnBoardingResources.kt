package com.codetron.personalmoneymanagerapp.resources

import androidx.annotation.DrawableRes
import com.codetron.personalmoneymanagerapp.R

data class OnBoardingItem(
    val id: String,
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

object OnBoardingRes {
    fun getResources() = listOf(
        OnBoardingItem(
            id = "1",
            title = "Manage Your Budgeting",
            description = "Easy manage your income and expense into category.",
            image = R.drawable.il_onboarding_1,
        ),
        OnBoardingItem(
            id = "2",
            title = "Track Your Expense",
            description = "Easy tracking and find your most spending at.",
            image = R.drawable.il_onboarding_2,
        ),
        OnBoardingItem(
            id = "3",
            title = "Set Your Goal",
            description = "You can set goals for your income and expense.",
            image = R.drawable.il_onboarding_3,
        ),
    )
}