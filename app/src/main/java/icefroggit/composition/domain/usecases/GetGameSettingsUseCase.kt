package icefroggit.composition.domain.usecases

import icefroggit.composition.domain.entity.GameSettings
import icefroggit.composition.domain.entity.Level
import icefroggit.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level:Level):GameSettings{
        return repository.getGameSettings(level)
    }
}