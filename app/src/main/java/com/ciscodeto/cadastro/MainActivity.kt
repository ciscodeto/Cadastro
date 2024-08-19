package com.ciscodeto.cadastro

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
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
        clearBtn = findViewById(R.id.clearBtn)
        saveBtn = findViewById(R.id.saveBtn)

        clearBtn.setOnClickListener {
            fullNameTxt.text.clear()
            phoneNumberTxt.text.clear()
            emailTxt.text.clear()
            isOnEmailListCB.isChecked = false
            cityTxt.text.clear()
            sexRG.clearCheck()
        }

        saveBtn.setOnClickListener {

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}