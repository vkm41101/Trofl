package com.vivek.trofle

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.vivek.trofle.databinding.FragmentHomeBinding
import java.util.*


class homeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind: FragmentHomeBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        val navController=findNavController()
        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.signOptionsFragment)
        }, 2000)


        return bind.root
    }
}