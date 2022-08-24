package mx.tec.a2022_itesm_02_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ChildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        val myTextView = findViewById<TextView>(R.id.textView4)
        val myNumberView = findViewById<TextView>(R.id.textView6)

        var myHashExtras : Bundle? = intent.extras

        var miTextoRecibido : String = myHashExtras?.getString("keyTexto")?:"NoTextoRecibido"
        var miNumeroRecibido : Int = myHashExtras?.getInt("keyNumero")?:0

        myTextView.text = miTextoRecibido
        myNumberView.text = miNumeroRecibido.toString()

        Log.d("MYTAG", "Fin de la ejecucion onCreate")
    }

    override fun onStart() {
        Log.d("MYTAG", "Fin de la ejecucion onCreate")
        super.onStart()
    }
}