package dev.nikhi1.eventbrite.clone

import android.app.Application
import dev.nikhi1.eventbrite.core.Core
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class EventBriteApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            androidLogger(Level.DEBUG)
            androidFileProperties()
        }
        Core(BuildConfig.DEBUG)
    }
}