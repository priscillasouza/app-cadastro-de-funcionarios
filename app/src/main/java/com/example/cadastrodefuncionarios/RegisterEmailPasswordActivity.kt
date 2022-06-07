package com.example.cadastrodefuncionarios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cadastrodefuncionarios.databinding.ActivityRegisterEmailPasswordBinding

class RegisterEmailPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterEmailPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterEmailPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarRegisterEmailPassword)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        getEmailPassword()

        binding.buttonRegisterEmailPassword.setOnClickListener {
            registerEmailPassword()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getEmailPassword() {
        val name = intent.getStringExtra("EXTRA_NAME")
        val cpf = intent.getStringExtra("EXTRA_CPF")
        val age = intent.getStringExtra("EXTRA_AGE")
        val profession = intent.getStringExtra("EXTRA_PROFESSION")
        val wage = intent.getStringExtra("EXTRA_WAGE")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val password = intent.getStringExtra("EXTRA_PASSWORD")

        binding.editTextDescriptionName.setText(name).toString()
        binding.editTextDescriptionCpf.setText(cpf).toString()
        binding.editTextDescriptionAge.setText(age).toString()
        binding.editTextDescriptionProfession.setText(profession).toString()
        binding.editTextDescriptionWage.setText(wage).toString()
        binding.editTextEmailEmployee.setText(email).toString()
        binding.editTextPasswordEmployee.setText(password).toString()
    }

    private fun registerEmailPassword() {
        val name = binding.editTextDescriptionName.text.toString()
        val cpf = binding.editTextDescriptionCpf.text.toString()
        val age = binding.editTextDescriptionAge.text.toString()
        val profession = binding.editTextDescriptionProfession.text.toString()
        val wage = binding.editTextDescriptionWage.text.toString()
        val email = binding.editTextEmailEmployee.text.toString()
        val password = binding.editTextPasswordEmployee.text.toString()

        val intent = Intent(this, PresentInformationActivity::class.java)
        intent.putExtra("EXTRA_NAME", name)
        intent.putExtra("EXTRA_CPF", cpf)
        intent.putExtra("EXTRA_AGE", age)
        intent.putExtra("EXTRA_PROFESSION", profession)
        intent.putExtra("EXTRA_WAGE", wage)
        intent.putExtra("EXTRA_EMAIL", email)
        intent.putExtra("EXTRA_PASSWORD", password)

        startActivity(intent)
    }
}
