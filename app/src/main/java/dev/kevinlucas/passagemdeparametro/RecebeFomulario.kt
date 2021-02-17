package dev.kevinlucas.passagemdeparametro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class RecebeFomulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recebe_fomulario)

        val intent = intent
        if (intent != null) {
            val params = intent.extras

            if (params != null) {
                val nome = params.getString("nome")
                val email = params.getString("email")

                val nomeView = findViewById<TextView>(R.id.textoNome)
                val emailView = findViewById<TextView>(R.id.textoEmail)

                nomeView.text = nome
                emailView.text = email
            }

        }
    }

    fun voltar(view: View) {
        finish()
    }
}