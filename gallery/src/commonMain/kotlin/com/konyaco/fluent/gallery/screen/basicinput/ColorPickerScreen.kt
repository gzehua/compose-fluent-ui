package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.konyaco.fluent.gallery.component.GalleryHeader

@Composable
fun ColorPickerScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "ColorPicker",
            "A selectable color spectrum."
        )
        // TODO:
    }
}