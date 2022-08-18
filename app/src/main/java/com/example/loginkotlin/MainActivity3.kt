package com.example.loginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.loginkotlin.databinding.ActivityMain3Binding
import com.example.loginkotlin.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {

    val Personas = Persona(nombre = "", telefono = "", edad = "")


    private lateinit var binding : ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)



        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bt1.setOnClickListener(View.OnClickListener {
            Personas.setNombre(binding.ed1.text.toString())
            Personas.setTelefono(binding.ed2.text.toString())
            Personas.setEdad(binding.text3.text.toString())

            Toast.makeText(this,"DATOS GUARDADOS", Toast.LENGTH_LONG).show()

        })

        binding.bt3.setOnClickListener(View.OnClickListener {
            limpar()
            Toast.makeText(this,"DATOS LIMPADOS", Toast.LENGTH_LONG).show()
        })

        binding.bt2.setOnClickListener(View.OnClickListener {
            binding.ed1.setText(Personas.getNombre().toString())
            binding.ed2.setText(Personas.getTelefono().toString())
            binding.text3.setText(Personas.getEdad().toString())
            Toast.makeText(this,"DATOS RECUPERADOS", Toast.LENGTH_LONG).show()
        })
    }

    fun limpar (){
        binding.ed1.setText("")
        binding.ed2.setText("")
        binding.text3.setText("")
    }
}