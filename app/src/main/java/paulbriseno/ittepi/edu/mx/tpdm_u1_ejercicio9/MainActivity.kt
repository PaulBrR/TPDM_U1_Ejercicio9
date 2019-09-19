package paulbriseno.ittepi.edu.mx.tpdm_u1_ejercicio9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var boton : Button?=null
    var tabla : TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton=findViewById(R.id.boton)
        tabla=findViewById(R.id.tabla)


    }
}
