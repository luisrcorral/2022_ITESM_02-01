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

        Log.d("MYTAG", "Fin de la ejecucion onCreate de ChildActivity")
    }


    override fun onStart() {
        Log.d("MYTAG", "Fin de la ejecucion OnStart de ChildActivity")
        super.onStart()
    }

    override fun onResume() {
        Log.d("MYTAG", "Fin de la ejecucion OnResume de ChildActivity")
        super.onResume()
    }

    override fun onPause() {
        // call the superclass method first
        Log.d("MYTAG", "Fin de la ejecucion onPause de ChildActivity")
        super.onPause()
    }


    override fun onStop() {
        // call the superclass method first
        Log.d("MYTAG", "Fin de la ejecucion OnStop de ChildActivity")
        super.onStop()
    }

    override fun onDestroy() {
        // call the superclass method first
        Log.d("MYTAG", "Fin de la ejecucion onDestroy de ChildActivity")
        super.onDestroy()
    }

    override fun onRestart() {
        // call the superclass method first
        Log.d("MYTAG", "Fin de la ejecucion onRestart de ChildActivity")
        super.onRestart()
    }
}