package com.example.farmerapp.presentation.farmer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.farmerapp.databinding.FragmentAddNewProductBinding

class AddNewProductFragment : Fragment() {

    private var _binding: FragmentAddNewProductBinding? = null
    val binding: FragmentAddNewProductBinding
        get() = _binding ?: throw RuntimeException("FragmentAddNewProductBinding is null")

    //private lateinit var viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddNewProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {

        @JvmStatic
        fun newInstance() =
            AddNewProductFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}