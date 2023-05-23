package com.example.quiznavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quiznavigation.databinding.FragmentQuestoesBinding
import com.google.android.material.snackbar.Snackbar

class QuestoesFragment : Fragment() {

    lateinit var bind: FragmentQuestoesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_questoes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind = FragmentQuestoesBinding.bind(view)

        val quest = RepositorioQuestoes().getQuestao()
        quest.alternativas.shuffle()

        bind.opcao1.text = quest.alternativas[0].descricao
        bind.opcao2.text = quest.alternativas[1].descricao
        bind.opcao3.text = quest.alternativas[2].descricao
        bind.opcao4.text = quest.alternativas[3].descricao

        bind.btnConfirma.setOnClickListener {

            val opcaoSelecionada = bind.opcaoes.checkedRadioButtonId

            var textoSelecionado = when(opcaoSelecionada){
                bind.opcao1.id -> bind.opcao1.text.toString()
                bind.opcao2.id -> bind.opcao2.text.toString()
                bind.opcao3.id -> bind.opcao3.text.toString()
                bind.opcao4.id -> bind.opcao4.text.toString()
                else -> ""
            }

             val selecionada = quest.alternativas.find { alt -> alt.descricao == textoSelecionado }

            if (selecionada?.correta == true){
                Snackbar.make(bind.root, "Acertou", Snackbar.LENGTH_SHORT).show()
            }else{
                Snackbar.make(bind.root, "Errou", Snackbar.LENGTH_SHORT).show()
            }

        }

    }

}