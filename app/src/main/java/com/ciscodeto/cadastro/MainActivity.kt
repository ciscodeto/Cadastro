package com.ciscodeto.cadastro

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var fullNameTxt: EditText
    private lateinit var phoneNumberTxt: EditText
    private lateinit var emailTxt: EditText
    private lateinit var isOnEmailListCB: CheckBox
    private lateinit var cityTxt: EditText
    private lateinit var sexRG: RadioGroup
    private lateinit var ufSpn: Spinner
    private lateinit var clearBtn: Button
    private lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        fullNameTxt = findViewById(R.id.nameTxt)
        phoneNumberTxt = findViewById(R.id.phoneTxt)
        emailTxt = findViewById(R.id.emailTxt)
        isOnEmailListCB = findViewById(R.id.emailListChk)
        cityTxt = findViewById(R.id.cityTxt)
        sexRG = findViewById(R.id.sexRG)
        ufSpn = findViewById(R.id.planets_spinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.uf_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            ufSpn.adapter = adapter
        }

        clearBtn = findViewById(R.id.clearBtn)
        saveBtn = findViewById(R.id.saveBtn)


        clearBtn.setOnClickListener {
            fullNameTxt.text.clear()
            phoneNumberTxt.text.clear()
            emailTxt.text.clear()
            isOnEmailListCB.isChecked = false
            cityTxt.text.clear()
            sexRG.clearCheck()
            ufSpn.setSelection(0)
        }

        saveBtn.setOnClickListener {
            val name = fullNameTxt.text.toString()
            val phone = phoneNumberTxt.text.toString()
            val email = emailTxt.text.toString()
            val isOnEmailList = isOnEmailListCB.isChecked
            val sex = findViewById<RadioButton>(sexRG.checkedRadioButtonId)?.text?.toString()
            val city = cityTxt.text.toString()
            val uf = ufSpn.selectedItem.toString()

            val formulario = Formulario(name, phone, email, isOnEmailList, sex, city, uf)

            Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show()
            val test: TextView = findViewById(R.id.verifyInputsTxt)
            test.text = formulario.toString()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}