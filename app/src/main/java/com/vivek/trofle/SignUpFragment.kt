package com.vivek.trofle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.vivek.trofle.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
    private var database: DatabaseReference=Firebase.database.reference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind:FragmentSignUpBinding=DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up,
            container, false)

        bind.submitButton.setOnClickListener {
            database.child("user_pass_values").child(bind.editTextNumber.text.toString()).setValue(bind.passwordEdit.text.toString())
            var adda:List<String> = listOf(bind.storeNameEditText.text.toString(), bind.storeAddressEditText.text.toString())
            database.child("store_address").child(bind.editTextNumber.text.toString()).setValue(adda.toString())
            view?.findNavController()?.navigate(R.id.login_fragment)

        }

        return bind.root
    }

}