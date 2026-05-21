package com.matt.geve.utils

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {
    private val sdf = SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.US)
    
    fun formatTimestamp(timestamp: Long): String {
        return sdf.format(Date(timestamp))
    }
    
    fun getPlayDuration(startTime: Long, endTime: Long): String {
        val durationMs = endTime - startTime
        val seconds = durationMs / 1000
        val minutes = seconds / 60
        val hours = minutes / 60
        
        return when {
            hours > 0 -> "${hours}h ${minutes % 60}m"
            minutes > 0 -> "${minutes}m ${seconds % 60}s"
            else -> "${seconds}s"
        }
    }
}

object NetworkUtils {
    fun getLatencyStatus(latency: Int): String {
        return when {
            latency < 20 -> "Excellent"
            latency < 50 -> "Very Good"
            latency < 100 -> "Good"
            latency < 150 -> "Fair"
            else -> "Poor"
        }
    }
    
    fun getCloudScoreColor(score: Int): String {
        return when {
            score >= 86 -> "Excellent"
            score >= 61 -> "Good"
            score >= 31 -> "Fair"
            else -> "Poor"
        }
    }
}
