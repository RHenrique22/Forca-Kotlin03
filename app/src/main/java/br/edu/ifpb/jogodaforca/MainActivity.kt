package br.edu.ifpb.jogodaforca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.edu.ifpb.jogodaforca.fachada.Fachada

class MainActivity : AppCompatActivity() {

    private lateinit var control: Fachada
    private lateinit var dica:    TextView
    private lateinit var palavra: TextView
    private lateinit var status:  TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // MONTAR O JOGO
        this.control = Fachada()
        this.control.registroPadrao()
        this.control.iniciar()

        // SELECT ELEMENTO PELO ID
        this.dica    = findViewById(R.id.txtView_Dica)
        this.palavra = findViewById(R.id.txtView_Palavra)
        this.status  = findViewById(R.id.txtView_Status)

        // MOSTRAR NA TELA O INIT DA FORCA
        this.dica.text    = this.control.dica()
        this.palavra.text = this.control.palavra()
        this.status.text  = this.control.status()
    }
}