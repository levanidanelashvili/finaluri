package com.example.myapplicationbottomnavigationmenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class cudifragmenti:Fragment(R.layout.cudifragment) {
    private lateinit var button3: Button
    private lateinit var editTextPhone:EditText
    private lateinit var editTextAddress:EditText
    private lateinit var textView:TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        button3 = view.findViewById(R.id.button3)
        editTextAddress = view.findViewById(R.id.editTextAddress)
        editTextPhone = view.findViewById(R.id.editTextPhone)
        textView = view.findViewById(R.id.textView)


        button3.setOnClickListener {
            var address = editTextAddress.text.toString()
            var phone = editTextPhone.text.toString()

        }







    }
}
