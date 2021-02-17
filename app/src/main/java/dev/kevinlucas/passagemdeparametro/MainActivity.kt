package dev.kevinlucas.passagemdeparametro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarFormulario(view: View?) {

        val nome = findViewById<EditText>(R.id.nomeCampo)
        val email = findViewById<EditText>(R.id.emailCampo)

        val intent = Intent(this, RecebeFomulario::class.java)

        val params = Bundle()
        params.putString("nome", nome.text.toString())
        params.putString("email", email.text.toString())

        intent.putExtras(params)

        startActivity(intent)
    }
}