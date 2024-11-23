    package com.comunidadedevspace.imc

    import android.content.Context
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.Button
    import com.google.android.material.snackbar.Snackbar
    import com.google.android.material.textfield.TextInputEditText

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

            btnCalcular.setOnClickListener {
                val pesStr: String = edtPeso.text.toString()
                val altStr: String = edtAltura.text.toString()

                if (pesStr.isEmpty() && altStr.isEmpty()) {
                    //Mostrar uma mensagem para o usuario
                    Snackbar.make(
                            findViewById(android.R.id.content),
                            "Preencha Todos Os Campos",
                            Snackbar.LENGTH_LONG
                        ).show()
                    } else if (pesStr.isEmpty()){
                        Snackbar.make(
                            edtPeso,
                            "Preencha o Campo ´Peso´",
                            Snackbar.LENGTH_SHORT
                        ).show()
                    } else if (altStr.isEmpty()) {
                        Snackbar.make(
                            edtAltura,
                            "Preencha o Campo ´Altura´",
                            Snackbar.LENGTH_LONG
                        ).show()
                    } else {
                    val pes = pesStr.toFloat()
                    val alt = altStr.toFloat()
                    //Monstrar uma mensagem para o usuario
                    val altQ2 = alt * alt
                    val resultado = pes / altQ2
                    println("Sab acao do botao" + resultado)
                    }
                }
            }
        }