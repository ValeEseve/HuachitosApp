package com.vantina.huachitos.presentation.huachitos.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.vantina.huachitos.domain.model.Huachito

@Composable
fun HuachitoCard(
    huachito: Huachito,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = huachito.nombre,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Tipo: ${huachito.tipoAnimal}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Edad: ${huachito.edad}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Estado: ${huachito.estado}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Región: ${huachito.region}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Comuna: ${huachito.comuna}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Vacunas: ${huachito.vacunas}", style = MaterialTheme.typography.bodyMedium)
            Text(
                text = "Esterilizado: ${if (huachito.esterilizado) "Sí" else "No"}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
