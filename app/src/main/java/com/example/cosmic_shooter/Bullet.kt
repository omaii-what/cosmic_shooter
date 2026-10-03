package com.example.cosmic_shooter

import kotlin.math.cos
import kotlin.math.sin

/**
 * Класс Bullet — модель пули.
 * Хранит позицию (x, y), скорость (speed) и угол полёта (angleDegrees).
 * Угол 0° — строго вверх, -45° — влево-вверх, +45° — вправо-вверх.
 */
data class Bullet(
    var x: Float,       // Позиция по горизонтали (центр пули)
    var y: Float,       // Позиция по вертикали (центр пули)
    val speed: Float = 20f,  // Скорость движения вверх
    val angleDegrees: Float = 0f
) {
    private val rad = Math.toRadians(angleDegrees.toDouble())
    private val vx = (speed * sin(rad)).toFloat()
    private val vy = (-speed * cos(rad)).toFloat()

    fun update() {
        x += vx
        y += vy
    }
}