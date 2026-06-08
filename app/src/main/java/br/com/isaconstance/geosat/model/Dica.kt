package br.com.isaconstance.geosat.model

import androidx.compose.ui.graphics.vector.ImageVector

data class Dica(
    val id: Int,
    val titulo: String,
    val descricao: String,
    val icon: ImageVector
)