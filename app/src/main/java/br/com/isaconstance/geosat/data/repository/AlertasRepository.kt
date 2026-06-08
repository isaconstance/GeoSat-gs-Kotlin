package br.com.isaconstance.geosat.data.repository

import br.com.isaconstance.geosat.data.datasource.AlertasDataSource
import br.com.isaconstance.geosat.model.Alerta
import br.com.isaconstance.geosat.model.Dica
import br.com.isaconstance.geosat.model.NivelAlerta

class AlertasRepository{

    fun getAlertas(): List<Alerta>{
        return AlertasDataSource.alertas
    }

    fun getAlertasByNivel(nivel: NivelAlerta): List<Alerta>{
        return AlertasDataSource.alertas
            .filter { it.nivel == nivel }
    }

    fun getDicas(): List<Dica>{
        return AlertasDataSource.dicas
    }

    fun getUltimoAlerta(): Alerta?{
        return AlertasDataSource.alertas.firstOrNull()
    }

}