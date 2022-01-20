package com.example.myapplicationbottomnavigationmenu

import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class HomeFragment: Fragment(R.layout.homefragment) {
    private lateinit var button:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(), MainActivity22::class.java)
            startActivity(intent)

        }


    }



}