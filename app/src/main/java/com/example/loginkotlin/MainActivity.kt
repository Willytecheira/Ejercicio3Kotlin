package com.example.loginkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.loginkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bt1.setOnClickListener(View.OnClickListener {
            if (binding.ed1.text.toString().equals("willington") && binding.ed2.text.toString().equals("28")){

                var act = Intent(this, MainActivity2 :: class.java)
                startActivity(act)
            }else{
                Toast.makeText(this, "DATOS INCORRECTOS", Toast.LENGTH_LONG).show()
            }
        })
    }
}