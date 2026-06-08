package br.com.isaconstance.geosat.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.isaconstance.geosat.ui.screens.AjudaScreen
import br.com.isaconstance.geosat.ui.screens.AlertasScreen
import br.com.isaconstance.geosat.ui.screens.DicasScreen
import br.com.isaconstance.geosat.ui.screens.EmergenciaScreen
import br.com.isaconstance.geosat.ui.screens.HomeScreen
import br.com.isaconstance.geosat.ui.screens.IntroScreen
import br.com.isaconstance.geosat.ui.screens.SplashScreen

@Composable
fun AppNavigation () {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SplashRoute
    ){

        composable<SplashRoute>{
            SplashScreen(
                onNavigateToIntro = {
                    navController.navigate(IntroRoute){
                        popUpTo(SplashRoute){
                            inclusive = true
                        }
                    }
                }
            )
        }


        composable<IntroRoute>{
            IntroScreen(
                onNavigateToHome = {
                    navController.navigate(HomeRoute){
                        popUpTo(IntroRoute){
                            inclusive = true
                        }
                    }
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable<HomeRoute>{
            HomeScreen(
                onNavigateToAlertas = {
                    navController.navigate(AlertasRoute)
                },
                onNavigateToDicas = {
                    navController.navigate(DicasRoute)
                },
                onNavigateToEmergencia = {
                    navController.navigate(EmergenciaRoute)
                }
            )
        }

        composable<AlertasRoute>{
            AlertasScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable<DicasRoute>{
            DicasScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable<EmergenciaRoute>{
            EmergenciaScreen(
                onNavigateToAjuda = {
                    navController.navigate(AjudaRoute)
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable<AjudaRoute>{
            AjudaScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

    }



}