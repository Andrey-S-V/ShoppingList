package com.example.shoppinglist.settings_screen

import androidx.compose.ui.graphics.Color
import com.example.shoppinglist.ui.theme.GreenProgress
import com.example.shoppinglist.ui.theme.RedProgress
import com.example.shoppinglist.ui.theme.YellowProgress

object ColorUtils {
    val ColorList = listOf(
        "#FF5733",
        "#4CAF50",
        "#2196F3",
        "#F44336",
        "#FFEB3B",
        "#9C27B0",
        "#00BCD4",
        "#3F51B5",
        "#795548",
        "#E91E63",
        "#607D8B",
        "#009688",
        "#CDDC39",
        "#FF9800",
        "#673AB7",
        "#8BC34A",
        "#C2185B",
        "#00ACC1",
        "#303F9F",
        "#FF5722",
        "#FDD835",
        "#0288D1",
        "#1DE9B6",
        "#7B1FA2",
        "#FFB74D"
    )

    fun getProgressColor(progress: Float): Color {
        return when(progress) {
            in 0.0..0.339 -> RedProgress
            in 0.34..0.669 -> YellowProgress
            in 0.67..1.0 -> GreenProgress
            else -> RedProgress
        }
    }
}