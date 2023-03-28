package com.example.estilos_strings

object ThemeStorage {

    var currentTheme = R.style.Theme_EstilosStrings

    const val ACTUAL = R.style.Theme_EstilosStrings
    const val NEW = R.style.Theme_EstilosStrings_EstiloSecudanrio

    fun swichThema(){
        currentTheme = when (currentTheme){
            ACTUAL -> NEW
            NEW -> ACTUAL
            else -> -1
        }
    }
}