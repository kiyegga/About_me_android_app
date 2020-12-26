package com.example.about_me

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import com.example.about_me.databinding.ActivityMainBinding
import android.os.Bundle as Bundle


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
       // setContentView(R.layout.activity_main)
       // setContentView(binding.root)
        val view = binding.root
        setContentView(view)
    }

    fun addNickname(view: View){
//     val editText = findViewById<EditText>(R.id.nicknameEdit)
//     val nicknameTextVeiw = findViewById<TextView>(R.id.nicknameText)
//        //text from editview to textview nickname
//        //hide editview and button, yhen display nickname textview
//        nicknameTextVeiw.text = editText.text
//        editText.visibility = View.GONE
//        view.visibility = View.GONE
//        nicknameTextVeiw.visibility = View.VISIBLE

//        val editText = findViewById<EditText>(R.id.nickname_edit)
//        val nicknameTextVeiw = findViewById<TextView>(R.id.nickname_text)

        binding.nicknameEdit.text = binding.nicknameEdit.text
        binding.nicknameText.visibility = View.GONE
        view.visibility = View.GONE
        binding.nameText.visibility = View.VISIBLE

        //hide keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}