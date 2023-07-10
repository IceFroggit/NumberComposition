package icefroggit.composition.domain.repository

import icefroggit.composition.domain.entity.GameSettings
import icefroggit.composition.domain.entity.Level
import icefroggit.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int,
    ): Question

    fun getGameSettings(level: Level): GameSettings
}