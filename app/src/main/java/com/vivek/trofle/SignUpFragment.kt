package com.vivek.trofle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.vivek.trofle.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind:FragmentSignUpBinding=DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, container, false)
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

}