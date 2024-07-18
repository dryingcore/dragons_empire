package com.github.dryingcore.dragonsempire

import com.badlogic.gdx.Application
import com.badlogic.gdx.Gdx
import com.github.dryingcore.dragonsempire.screen.GameScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen

class DragonsEmpire : KtxGame<KtxScreen>() {

    override fun create() {
        Gdx.app.logLevel = Application.LOG_DEBUG
        addScreen(GameScreen())
        setScreen<GameScreen>()
    }
}
