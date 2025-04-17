package io.github.composefluent.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalContentColor
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.hazeEffect
import dev.chrisbanes.haze.hazeSource

@Composable
fun Mica(modifier: Modifier, content: @Composable () -> Unit) {
    Box(modifier.background(FluentTheme.colors.background.mica.base)) {
        CompositionLocalProvider(LocalContentColor provides FluentTheme.colors.text.text.primary) {
            content()
        }
    }
}

@Composable
fun Mica(
    background: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier,
        propagateMinConstraints = true
    ) {
        val hazeState = remember { HazeState() }
        Box(
            propagateMinConstraints = true,
            modifier = Modifier.matchParentSize().hazeSource(state = hazeState)
        ) {
            background()
        }
        Box(modifier = Modifier.fillMaxSize().hazeEffect(state = hazeState, style = MaterialDefaults.mica().style)) {
            CompositionLocalProvider(
                LocalContentColor provides FluentTheme.colors.text.text.primary
            ) {
                content()
            }
        }
    }
}