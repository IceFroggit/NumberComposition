package IceFroggit.composition.domain.usecases

import IceFroggit.composition.domain.entity.GameSettings
import IceFroggit.composition.domain.entity.Level
import IceFroggit.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level:Level):GameSettings{
        return repository.getGameSettings(level)
    }
}