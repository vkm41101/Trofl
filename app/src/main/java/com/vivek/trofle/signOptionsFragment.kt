package com.vivek.trofle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.vivek.trofle.databinding.FragmentSignOptionsBinding


class signOptionsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind:FragmentSignOptionsBinding=DataBindingUtil.inflate(inflater, R.layout.fragment_sign_options, container, false)
        bind.buttonnLogin.setOnClickListener ( Navigation.createNavigateOnClickListener(R.id.action_signOptionsFragment_to_login_fragment) )
        bind.buttonSignup.setOnClickListener ( Navigation.createNavigateOnClickListener(R.id.action_signOptionsFragment_to_signUpFragment) )
        return bind.root
    }

}