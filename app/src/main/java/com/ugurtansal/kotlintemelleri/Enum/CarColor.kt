package com.ugurtansal.kotlintemelleri.Enum

enum class CarColor {
    RED, BLUE, GREEN, BLACK, WHITE;

    fun getColorDescription(): String {
        return when (this) {
            RED -> "The color of passion and energy."
            BLUE -> "The color of calm and serenity."
            GREEN -> "The color of nature and freshness."
            BLACK -> "The color of elegance and sophistication."
            WHITE -> "The color of purity and simplicity."
        }
    }
}