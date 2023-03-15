package com.example.app_cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome:EditText = findViewById(R.id.edtNome)
        val edtEndereco:EditText = findViewById(R.id.edtEndereco)
        val edtBairro:EditText = findViewById(R.id.edtBairro)
        val edtCEP:EditText = findViewById(R.id.edtCEP)
        val edtCidade:EditText = findViewById(R.id.edtCidade)
        val edtEstado:EditText = findViewById(R.id.edtEstado)
        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener{
            val toast = Toast.makeText(this, "Cadastro concluído", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}