package com.matt.geve.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF4DC9FF),
    onPrimary = Color(0xFF003D73),
    primaryContainer = Color(0xFF005BA8),
    onPrimaryContainer = Color(0xFFD1E4FF),
    secondary = Color(0xFFB7C9DB),
    onSecondary = Color(0xFF243448),
    secondaryContainer = Color(0xFF3A4B60),
    onSecondaryContainer = Color(0xFFD1E4FF),
    tertiary = Color(0xFFC7B8FF),
    onTertiary = Color(0xFF33278A),
    tertiaryContainer = Color(0xFF4A3FA1),
    onTertiaryContainer = Color(0xFFE9DDFF),
    error = Color(0xFFFFB4AB),
    errorContainer = Color(0xFF93000A),
    onError = Color(0xFF690005),
    onErrorContainer = Color(0xFFFFDAD6),
    background = Color(0xFF0F1419),
    onBackground = Color(0xFFE7E0E8),
    surface = Color(0xFF0F1419),
    onSurface = Color(0xFFE7E0E8),
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF0055B8),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFD1E4FF),
    onPrimaryContainer = Color(0xFF001D3C),
    secondary = Color(0xFF536B7E),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFD9E3F0),
    onSecondaryContainer = Color(0xFF101C2B),
    tertiary = Color(0xFF6851A6),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFEADDFF),
    onTertiaryContainer = Color(0xFF21005E),
    error = Color(0xFFB3261E),
    errorContainer = Color(0xFFF9DEDC),
    onError = Color(0xFFFFFFFF),
    onErrorContainer = Color(0xFF410E0B),
    background = Color(0xFFFBF8FF),
    onBackground = Color(0xFF1A1720),
    surface = Color(0xFFFBF8FF),
    onSurface = Color(0xFF1A1720),
)

@Composable
fun GEvETheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
