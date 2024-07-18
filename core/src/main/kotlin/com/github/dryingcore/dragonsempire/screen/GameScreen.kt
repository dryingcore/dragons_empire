package com.github.dryingcore.dragonsempire.screen

import ktx.app.KtxScreen
import ktx.log.logger

class GameScreen: KtxScreen {

    override fun show() {
        log.debug { "GameScreen is running" }
    }

    companion object {
        private val log = logger<GameScreen>()
    }
}
