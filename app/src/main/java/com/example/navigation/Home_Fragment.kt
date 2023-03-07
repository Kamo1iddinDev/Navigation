package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.navigation.Models.User
import com.example.navigation.databinding.FragmentHomeBinding

class Home_Fragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding.save.setOnClickListener {
            val user = User(binding.edtName.text.toString(), binding.edtAge.text.toString().toInt())
            findNavController().navigate(R.id.profilFragment2, bundleOf("keyUser" to user ))
        }

        return binding.root
    }
}