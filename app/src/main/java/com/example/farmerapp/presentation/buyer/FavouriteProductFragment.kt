package com.example.farmerapp.presentation.buyer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.farmerapp.R
import com.example.farmerapp.databinding.FragmentFavouriteProductBinding

class FavouriteProductFragment : Fragment() {

    private var _binding: FragmentFavouriteProductBinding? = null
    val binding: FragmentFavouriteProductBinding
        get() = _binding ?: throw RuntimeException("FragmentFavouriteProductBinding is null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavouriteProductBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FavouriteProductFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}