package br.com.zup.filme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoMensagem = findViewById<Button>(R.id.botao_mensagem)

        botaoMensagem.setOnClickListener {
            Toast.makeText(this, "Esse filme é maravilhoso", Toast.LENGTH_LONG).show()
        }
    }
}