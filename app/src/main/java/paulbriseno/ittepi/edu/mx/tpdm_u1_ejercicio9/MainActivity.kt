package paulbriseno.ittepi.edu.mx.tpdm_u1_ejercicio9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var boton : Button?=null
    var tabla : TextView?=null
    var numeromul : TextView?=null
    var numerodos: TextView?=null
    var contador =0
    var mensage =""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton=findViewById(R.id.boton)
        tabla=findViewById(R.id.tabla)
        numeromul=findViewById(R.id.numeromu)
        numerodos = findViewById(R.id.numerodo)



        boton?.setOnClickListener {

            

        }

    }
}
