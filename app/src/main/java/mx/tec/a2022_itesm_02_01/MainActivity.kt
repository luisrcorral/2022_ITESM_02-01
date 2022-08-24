package mx.tec.a2022_itesm_02_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextOB = findViewById<EditText>(R.id.myText)
        val myNumOB = findViewById<EditText>(R.id.myNumber)
        var myButton = findViewById<Button>(R.id.button)

        myButton.setOnClickListener {

            var texto : String = myTextOB.text.toString()
            var numero : Int = parseInt(myNumOB.text.toString())

            val myIntent = Intent(this, ChildActivity::class.java)

            myIntent.putExtra("keyTexto", texto)
            myIntent.putExtra("keyNumero", numero)

            startActivity(myIntent)

        }
        Log.d("MYTAG", "Fin de la ejecucion OnCreate de MainActivity")
    }

    override fun onStart() {
        Log.d("MYTAG", "Fin de la ejecucion OnStart de MainActivity")
        super.onStart()
    }

    override fun onResume() {
        Log.d("MYTAG", "Fin de la ejecucion OnResume de MainActivity")
        super.onResume()
    }
}