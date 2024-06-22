package com.app.tunetrove.player

import android.content.Intent
import android.os.Build
import android.service.quicksettings.TileService
import androidx.annotation.RequiresApi
import com.app.tunetrove.GoConstants
import com.app.tunetrove.ui.MainActivity

@RequiresApi(Build.VERSION_CODES.N)
class PlayerTileService : TileService() {

    override fun onClick() {
        super.onClick()
        with(Intent(this, MainActivity::class.java)) {
            putExtra(GoConstants.LAUNCHED_BY_TILE, GoConstants.LAUNCHED_BY_TILE)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivityAndCollapse(this)
        }
    }
}
