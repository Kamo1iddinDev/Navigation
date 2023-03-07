package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation.Models.User
import com.example.navigation.databinding.FragmentProfilBinding

class ProfilFragment : Fragment() {
    private val binding by lazy { FragmentProfilBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val user = arguments?.getSerializable("keyUser")as User
        binding.tvName.text = user.name
        binding.tvAge.text = user.age.toString()

        return binding.root
    }
}