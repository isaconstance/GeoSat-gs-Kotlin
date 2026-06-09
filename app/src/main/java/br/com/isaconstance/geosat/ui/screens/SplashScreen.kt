package br.com.isaconstance.geosat.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.isaconstance.geosat.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onNavigateToIntro: () -> Unit
) {
    LaunchedEffect(Unit){
        delay(3000L)
        onNavigateToIntro()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF112240)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_geosat),
            contentDescription = "Logo GeoSat",
            modifier = Modifier.size(180.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "GEOSAT",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            letterSpacing = 4.sp
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Monitoramento inteligente\ne alertas em tempo real.",
            fontSize = 14.sp,
            color = Color.White.copy(alpha = 0.7f),
            textAlign = TextAlign.Center,
            lineHeight = 20.sp,
            modifier = Modifier.padding(horizontal = 32.dp)
        )
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen (
        onNavigateToIntro = {}
    )
}