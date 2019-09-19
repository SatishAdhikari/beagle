package com.pandulapeter.debugMenu

import android.app.Activity
import android.app.Application
import com.pandulapeter.debugMenuCore.configuration.ModuleConfiguration
import com.pandulapeter.debugMenuCore.configuration.UiConfiguration
import com.pandulapeter.debugMenuCore.contracts.DebugMenuContract

/**
 * Fake implementation to be used in release builds.
 */
object DebugMenu : DebugMenuContract {

    /**
     * Does nothing.
     */
    override var moduleConfiguration = ModuleConfiguration()

    /**
     * Does nothing.
     */
    override fun initialize(application: Application, uiConfiguration: UiConfiguration, moduleConfiguration: ModuleConfiguration) = Unit

    /**
     * Does nothing and returns false.
     */
    override fun closeDrawer(activity: Activity) = false

    /**
     * Does nothing.
     */
    override fun openDrawer(activity: Activity) = Unit

    /**
     * Does nothing.
     */
    override fun log(message: String, tag: String?, payload: String?) = Unit
}