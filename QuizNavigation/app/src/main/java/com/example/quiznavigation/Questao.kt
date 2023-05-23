package com.example.quiznavigation

data class Questao (
    val textoQuestao: String,
    val alternativas : MutableList<Alternativa>
)