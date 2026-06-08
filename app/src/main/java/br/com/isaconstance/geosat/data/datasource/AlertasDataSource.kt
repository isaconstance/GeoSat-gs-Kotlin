package br.com.isaconstance.geosat.data.datasource

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Warning
import br.com.isaconstance.geosat.model.Alerta
import br.com.isaconstance.geosat.model.Dica
import br.com.isaconstance.geosat.model.NivelAlerta

object AlertasDataSource {

    val alertas = listOf(
        Alerta(1, "Chuva Forte", NivelAlerta.ALTO, "Hoje, 10:30"),
        Alerta(2, "Rajadas de Vento", NivelAlerta.MEDIO, "Hoje, 09:15"),
        Alerta(3, "Calor Extremo", NivelAlerta.ALTO, "Hoje, 12:30"),
        Alerta(4, "Risco de Alagamento", NivelAlerta.ALTO, "Hoje, 18:20"),
        Alerta(5, "Baixa Umidade", NivelAlerta.BAIXO, "Hoje, 16:10"),
    )

    val dicas = listOf(
        Dica(1, "Em caso de enchente",
            "Evite áreas alagadas e não dirija em ruas inundadas.",
            Icons.Default.Warning),
        Dica(2, "Desligue aparelhos elétricos",
            "Desconecte aparelhos da tomada para evitar curtos e riscos.",
            Icons.Default.Phone),
        Dica(3, "Mantenha documentos em locais seguros",
            "Proteja seus documentos e objetos importantes.",
            Icons.Default.Place),
        Dica(4, "Fique atento aos alertas",
            "Acompanhe as atualizações e siga as orientações.",
            Icons.Default.Notifications)
    )
}