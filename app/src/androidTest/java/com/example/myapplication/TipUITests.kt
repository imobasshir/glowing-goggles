package com.example.myapplication

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test
import com.example.myapplication.ui.theme.MyApplicationTheme

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            MyApplicationTheme {
                TipTimeScreen()
            }
        }
        composeTestRule.onNodeWithText("Cost of Service").performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("20")
        composeTestRule.onNodeWithText("Tip Amount: ₹ 2.00").assertExists()
    }
}
