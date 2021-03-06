package com.pandulapeter.beagle

import android.app.Activity
import android.app.Application
import com.pandulapeter.beagleCore.configuration.Positioning
import com.pandulapeter.beagleCore.configuration.Appearance
import com.pandulapeter.beagleCore.configuration.Trick
import com.pandulapeter.beagleCore.contracts.BeagleContract

/**
 * Fake implementation to be used in release builds.
 */
object Beagle : BeagleContract {

    /**
     * Does nothing.
     */
    override var isEnabled = false
        set(_) = Unit

    /**
     * Does nothing.
     */
    override fun imprint(application: Application, appearance: Appearance) = Unit

    /**
     * Does nothing.
     */
    override fun learn(tricks: List<Trick>) = Unit

    /**
     * Does nothing.
     */
    override fun learn(trick: Trick, positioning: Positioning) = Unit

    /**
     * Does nothing.
     */
    override fun forget(id: String) = Unit

    /**
     * Does nothing and returns false.
     */
    override fun dismiss(activity: Activity) = false

    /**
     * Does nothing.
     */
    override fun fetch(activity: Activity) = Unit

    /**
     * Does nothing.
     */
    override fun log(message: String, tag: String?, payload: String?) = Unit
}