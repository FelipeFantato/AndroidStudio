package com.example.quiznavigation

import kotlin.random.Random

class RepositorioQuestoes {

    val questoes = mutableListOf<Questao>(
        Questao(
            "Qual resultado de 1+1?",
            mutableListOf(
                Alternativa("valor 5", false),
                Alternativa("valor 2", true),
                Alternativa("valor 1", false),
                Alternativa("valor 3", false)
            )
        )
    )

    fun getQuestao():Questao{
        return questoes[Random.nextInt(questoes.size)]
    }
}