package br.com.isaconstance.geosat.model

data class Alerta(
    val id: Int,
    val tipo: String,
    val nivel: NivelAlerta,
    val horario: String
)

enum class NivelAlerta(val label: String){
    ALTO("Alto"),
    MEDIO("Médio"),
    BAIXO("Baixo")
}