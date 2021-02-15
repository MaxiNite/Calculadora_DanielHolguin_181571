package mx.edu.itson.calculadora_danielholguin_181571

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num1: Int = 0
    var num2: Int = 0
    var numeros: String = ""
    var resultado: String = ""
    var operador: String = ""
    var operacion: Int = 0
    var aux: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNumeros: TextView = findViewById(R.id.tvNumeros) as TextView
        val tvResultado: TextView = findViewById(R.id.tvResultado) as TextView
        val btn0: Button = findViewById(R.id.btn0) as Button
        val btn1: Button = findViewById(R.id.btn1) as Button
        val btn2: Button = findViewById(R.id.btn2) as Button
        val btn3: Button = findViewById(R.id.btn3) as Button
        val btn4: Button = findViewById(R.id.btn4) as Button
        val btn5: Button = findViewById(R.id.btn5) as Button
        val btn6: Button = findViewById(R.id.btn6) as Button
        val btn7: Button = findViewById(R.id.btn7) as Button
        val btn8: Button = findViewById(R.id.btn8) as Button
        val btn9: Button = findViewById(R.id.btn9) as Button
        val btnSuma: Button = findViewById(R.id.btnSuma) as Button
        val btnResta: Button = findViewById(R.id.btnResta) as Button
        val btnMulti: Button = findViewById(R.id.btnMulti) as Button
        val btnDivision: Button = findViewById(R.id.btnDivision) as Button
        val btnBorrar: Button = findViewById(R.id.btnBorrar) as Button
        val btnResultado: Button = findViewById(R.id.btnResultado) as Button

        btn0.setOnClickListener {
            numeros = numeros.toString() + "0"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btn1.setOnClickListener {
            numeros = numeros.toString() + "1"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btn2.setOnClickListener {
            numeros = numeros.toString() + "2"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btn3.setOnClickListener {
            numeros = numeros.toString() + "3"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btn4.setOnClickListener {
            numeros = numeros.toString() + "4"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btn5.setOnClickListener {
            numeros = numeros.toString() + "5"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btn6.setOnClickListener {
            numeros = numeros.toString() + "6"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btn7.setOnClickListener {
            numeros = numeros.toString() + "7"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btn8.setOnClickListener {
            numeros = numeros.toString() + "8"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btn9.setOnClickListener {
            numeros = numeros.toString() + "9"
            tvNumeros.setText(numeros)
            aux = numeros.toInt()
        }
        btnSuma.setOnClickListener {
            num1 = aux
            resultado = numeros.toString() + "+"
            tvResultado.setText(resultado)
            tvNumeros .setText("")
            operador = "+"
            numeros = ""
            aux = 0
        }
        btnResta.setOnClickListener {
            num1 = aux
            resultado = numeros.toString() + "-"
            tvResultado.setText(resultado)
            tvNumeros .setText("")
            operador = "-"
            numeros = ""
            aux = 0
        }
        btnMulti.setOnClickListener {
            num1 = aux
            resultado = numeros.toString() + "*"
            tvResultado.setText(resultado)
            tvNumeros .setText("")
            operador = "*"
            numeros = ""
            aux = 0
        }
        btnDivision.setOnClickListener {
            num1 = aux
            resultado = numeros.toString() + "/"
            tvResultado.setText(resultado)
            tvNumeros .setText("")
            operador = "/"
            numeros = ""
            aux = 0
        }
        btnResultado.setOnClickListener {
            if (operador.equals("+")){
                num2 = aux
                operacion = num1 + num2
                tvResultado.setText(operacion.toString())
                tvNumeros.setText("0")
            }
            if (operador.equals("-")){
                num2 = aux
                operacion = num1 - num2
                tvResultado.setText(operacion.toString())
                tvNumeros.setText("0")
            }
            if (operador.equals("*")){
                num2 = aux
                operacion = num1 * num2
                tvResultado.setText(operacion.toString())
                tvNumeros.setText("0")
            }
            if (operador.equals("/")){
                num2 = aux
                operacion = num1 / num2
                tvResultado.setText(operacion.toString())
                tvNumeros.setText("0")
            }
        }
        btnBorrar.setOnClickListener {
            numeros = ""
            resultado = ""
            operador = ""
            num1 = 0
            num2 = 0
            aux = 0
            tvResultado.setText("")
            tvNumeros.setText("")
        }
    }


}