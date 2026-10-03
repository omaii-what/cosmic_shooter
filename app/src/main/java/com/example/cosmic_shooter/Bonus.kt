package com.example.cosmic_shooter

enum class BonusType {
    WEAPON,
    BOMB
}

data class Bonus(
    var x: Float,
    var y: Float,
    val size: Float = 60f,
    val type: BonusType,
    val speed: Float = 5f
)