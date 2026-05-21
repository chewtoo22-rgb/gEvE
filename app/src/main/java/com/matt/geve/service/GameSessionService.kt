package com.matt.geve.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import com.matt.geve.data.GameSession
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

/**
 * Foreground service for tracking active game sessions
 * Maintains continuous monitoring even when app is in background
 */
class GameSessionService : Service() {
    private val binder = LocalBinder()
    private val scope = CoroutineScope(Dispatchers.Default + Job())
    
    private var currentSession: GameSession? = null

    inner class LocalBinder : Binder() {
        fun getService(): GameSessionService = this@GameSessionService
    }

    override fun onBind(intent: Intent): IBinder {
        return binder
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Start foreground notification
        // createNotification() would be implemented here
        
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }

    fun startSession(session: GameSession) {
        currentSession = session
    }

    fun stopSession() {
        currentSession = null
    }

    fun getCurrentSession(): GameSession? = currentSession
}
