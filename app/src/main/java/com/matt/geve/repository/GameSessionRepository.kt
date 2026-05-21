package com.matt.geve.repository

import com.matt.geve.data.GameSession
import com.matt.geve.data.GameSessionDao
import kotlinx.coroutines.flow.Flow

/**
 * Repository pattern for game session data access
 */
class GameSessionRepository(private val gameSessionDao: GameSessionDao) {
    
    fun getRecentSessions(limit: Int = 10): Flow<List<GameSession>> {
        return gameSessionDao.getRecentSessions(limit)
    }

    suspend fun insertSession(session: GameSession): Long {
        return gameSessionDao.insertSession(session)
    }

    suspend fun updateSession(session: GameSession) {
        gameSessionDao.updateSession(session)
    }

    suspend fun getSessionById(sessionId: Long): GameSession? {
        return gameSessionDao.getSessionById(sessionId)
    }

    fun getSessionCount(): Flow<Int> {
        return gameSessionDao.getSessionCount()
    }

    fun getAverageCloudScore(): Flow<Float?> {
        return gameSessionDao.getAverageCloudScore()
    }

    fun getAverageLatency(): Flow<Int?> {
        return gameSessionDao.getAverageLatency()
    }

    fun getTotalPlayTime(): Flow<Long?> {
        return gameSessionDao.getTotalPlayTime()
    }

    fun getLastSessionDate(): Flow<Long?> {
        return gameSessionDao.getLastSessionDate()
    }

    suspend fun deleteSession(sessionId: Long) {
        gameSessionDao.deleteSession(sessionId)
    }

    suspend fun deleteOldSessions(beforeTimestamp: Long) {
        gameSessionDao.deleteOldSessions(beforeTimestamp)
    }
}
