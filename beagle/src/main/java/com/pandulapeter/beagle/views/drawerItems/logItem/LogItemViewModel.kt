package com.pandulapeter.beagle.views.drawerItems.logItem

import com.pandulapeter.beagle.models.LogItem
import com.pandulapeter.beagle.views.drawerItems.DrawerItemViewModel
import com.pandulapeter.beagleCore.configuration.Trick
import java.text.SimpleDateFormat
import java.util.Locale

internal data class LogItemViewModel(
    private val logListTrick: Trick.LogList,
    val logItem: LogItem,
    val onItemSelected: () -> Unit
) : DrawerItemViewModel {

    override val id = "logMessage_${logItem.id}"
    val timestamp = if (logListTrick.shouldShowTimestamp) SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(logItem.timestamp) else null
    val message = logItem.message
    val hasPayload = logItem.payload != null
}