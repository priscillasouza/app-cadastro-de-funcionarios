package com.example.cadastrodefuncionarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cadastrodefuncionarios.databinding.ActivityPresentInformationBinding

class PresentInformationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPresentInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPresentInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getEmployee()
    }

    private fun getEmployee() {
        val name = intent.getStringExtra("EXTRA_NAME")
        val cpf = intent.getStringExtra("EXTRA_CPF")
        val age = intent.getStringExtra("EXTRA_AGE")
        val profession = intent.getStringExtra("EXTRA_PROFESSION")
        val wage = intent.getStringExtra("EXTRA_WAGE")
        val email = intent.getStringExtra("EXTRA_EMAIL")

        val employeeDescription =
            "$name, inscrito(a) no cpf $cpf, tem $age de idade, trabalha como $profession e ganha $wage por mês"
        binding.textViewDescriptionEmployee.text = employeeDescription

        val employeeEmail = "Email: $email"
        binding.textViewEmailEmployee.text = employeeEmail
    }
}