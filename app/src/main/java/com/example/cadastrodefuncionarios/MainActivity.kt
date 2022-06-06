package com.example.cadastrodefuncionarios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cadastrodefuncionarios.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRegisterUser.setOnClickListener {
            registerEmployee()
        }
    }

    private fun registerEmployee() {
        val name = binding.editTextNameEmployee.text.toString()
        val cpf = binding.editTextCpfEmployee.text.toString()
        val age = binding.editTextAgeEmployee.text.toString()
        val profession = binding.editTextProfessionEmployee.text.toString()
        val wage = binding.editTextWageEmployee.text.toString()

        val intent = Intent(this, RegisterEmailPasswordActivity::class.java)
        intent.putExtra("EXTRA_NAME", name)
        intent.putExtra("EXTRA_CPF", cpf)
        intent.putExtra("EXTRA_AGE", age)
        intent.putExtra("EXTRA_PROFESSION", profession)
        intent.putExtra("EXTRA_WAGE",wage)

        startActivity(intent)
    }
}


