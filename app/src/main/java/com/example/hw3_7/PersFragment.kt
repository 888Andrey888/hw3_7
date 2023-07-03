package com.example.hw3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw3_7.databinding.FragmentPersBinding

class PersFragment : Fragment() {
    private lateinit var binding: FragmentPersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPersBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = PersAdapter(Model.getList(), this::onClickItem)
        binding.rvPers.adapter = adapter
    }

    private fun onClickItem(pers: PersModel){
        findNavController().navigate(PersFragmentDirections.actionPersFragmentToDetailsFragment(pers))
    }
}