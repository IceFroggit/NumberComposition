package IceFroggit.composition.domain.repository

import IceFroggit.composition.domain.entity.GameSettings
import IceFroggit.composition.domain.entity.Level
import IceFroggit.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        masXumValue: Int,
        countOfOptions: Int,
    ): Question

    fun getGameSettings(level: Level): GameSettings
}