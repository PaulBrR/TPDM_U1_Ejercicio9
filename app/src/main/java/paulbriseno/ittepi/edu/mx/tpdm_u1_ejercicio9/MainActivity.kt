package paulbriseno.ittepi.edu.mx.tpdm_u1_ejercicio9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    var boton : Button?=null
    var tabla : TextView?=null
    var numeromul : TextView?=null
    var numerodos: TextView?=null
    var contador =0
    var wow = 0
    var calculos = 0
    var aux =0
    var layo : LinearLayout?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton=findViewById(R.id.boton)
        tabla=findViewById(R.id.tabla)
        numeromul=findViewById(R.id.numeromu)
        numerodos = findViewById(R.id.numerodo)




        boton?.setOnClickListener {
            layo=findViewById(R.id.layin)
            layo?.removeAllViews()
            var vectoroper=Vector<TextView>()
            aux = numeromul?.text.toString().toInt()
            wow=numerodos?.text.toString().toInt()
            var vector = numeromul?.text.toString()

            if (wow>=aux){
                (1..wow).forEach {


                    if (wow >= 0) {


                        calculos= aux*contador

                        var rbd = TextView(this)
                        rbd.setText("$aux"+"x"+"$it"+"="+calculos)
                        rbd.textSize= 20F
                        layo?.addView(rbd)
                    }
                    contador++

                }
            }


            numeromul?.setText("")
            numerodos?.setText("")
        }

    }
}
