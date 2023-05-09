package com.example.fragmentssample

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentssample.databinding.FragmentListBinding

class ListFragment : Fragment() {

    lateinit var bind: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind = FragmentListBinding.bind(view)

        bind.btnItemA.setOnClickListener {
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                loadFrag(DetailFragmentA())
            } else {
                val intent = Intent(requireContext(), DetailActivity::class.java)
                intent.putExtra("FragToLoad", "A")
                startActivity(intent)
            }
        }

        bind.btnItemB.setOnClickListener {
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                loadFrag(DetailFragmentB())
            } else {
                val intent = Intent().apply {
                    setClass(requireContext(), DetailActivity::class.java)
                    putExtra("FragToLoad", "B")
                }
                startActivity(intent)
            }
        }

        bind.btnItemC.setOnClickListener {
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                loadFrag(DetailFragmentC())
            } else {
                val intent = Intent().apply {
                    setClass(requireContext(), DetailActivity::class.java)
                    putExtra("FragToLoad", "C")
                }
                startActivity(intent)
            }
        }


    }

    private fun loadFrag(frag:Fragment) {
        val fragmentManager = parentFragmentManager
        val fragTransaction = fragmentManager.beginTransaction()
        //fragTransaction.add(R.id.details, frag)
        fragTransaction.replace(R.id.details, frag)
        fragTransaction.addToBackStack(null)
        fragTransaction.commit()
    }

}