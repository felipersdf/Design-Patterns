package com.example.mysmarthouse.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import com.example.mysmarthouse.R
import com.example.mysmarthouse.model.Ar
import com.example.mysmarthouse.model.Light
import com.example.mysmarthouse.model.Sensor
import com.example.mysmarthouse.model.observer_pattern.ArCondicionadoObserver
import com.example.mysmarthouse.model.observer_pattern.ChangingTemperatureBySensorListener

class LivingRoomActivity : AppCompatActivity() {

    private lateinit var seekBarTemperature: SeekBar
    private lateinit var seekBarMovement: SeekBar
    private lateinit var buttonLight: Button
    private lateinit var buttonAr: Button
    private lateinit var textoAmbiente: TextView

    private lateinit var light: Light
    private lateinit var ar: Ar
    private lateinit var sensor: Sensor
    val ArObserver: ArCondicionadoObserver = ArCondicionadoObserver(ChangingTemperatureBySensorListener())

//    private lateinit var cenario: ScenarioDecorator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_living_room)

        this.seekBarTemperature = findViewById(R.id.LvSkTempSensor)
        this.seekBarMovement = findViewById(R.id.LvSkMovSensor)
        this.buttonLight = findViewById(R.id.LvButtonLight)
        this.buttonAr = findViewById(R.id.LvButtonAr)
        this.textoAmbiente = findViewById(R.id.LvTvAmbiente)

//        this.cenario = LivingRoomScenario(light, sensor)

        this.light = Light(false)
        this.ar = Ar(false, 15)

        this.seekBarTemperature.setProgress(15)

        this.buttonLight.setOnClickListener({ onClickLight(it) })
        this.buttonAr.setOnClickListener({ onClickAr(it) })

        this.seekBarMovement.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Do something
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Do something
                var valor = seekBarTemperature
                if(!ar.isOn){
                    Toast.makeText(applicationContext,"O Ar-Condicionado está desligado!!", Toast.LENGTH_SHORT).show()

                } else {

                    if (seekBarMovement.progress > 25 && valor.progress > 20){
                        Toast.makeText(applicationContext,"A sala tem muita gente!!",Toast.LENGTH_SHORT).show()
                        valor.setProgress(18)
                        ArObserver.temperatura = 18

                    } else if (seekBarMovement.progress < 25 &&  valor.progress < 20) {
                        Toast.makeText(applicationContext, "A sala tem pouca gente...", Toast.LENGTH_SHORT).show()
                        valor.setProgress(25)
                        ArObserver.temperatura = 25
                    }
                }
            }
        })


        this.seekBarTemperature.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Do something
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Do something
            }
        })
    }

    fun onClickLight (view: View){

        if(!this.light.isOn){

            this.buttonLight.setText("ON")
            this.textoAmbiente.setBackgroundColor(Color.WHITE)
            this.textoAmbiente.setTextColor(Color.BLACK)
            this.light.turnOn()

            Toast.makeText(this, "A luz está ligada!! : ${this.light.isOn}", Toast.LENGTH_SHORT).show()

        } else{

            this.buttonLight.setText("OFF")
            this.textoAmbiente.setBackgroundColor(Color.BLACK)
            this.textoAmbiente.setTextColor(Color.WHITE)
            this.light.turnOff()

            Toast.makeText(this, "A luz foi desligada!! ${this.light.isOn}", Toast.LENGTH_SHORT).show()

        }

    }

    fun onClickAr (view: View) {

        if(!this.ar.isOn){

            this.buttonAr.setText("ON")
            this.ar.turnOn()

            Toast.makeText(this, "Ar Ligado!! ${this.ar.isOn}", Toast.LENGTH_SHORT).show()

        } else {

            this.buttonAr.setText("OFF")
            this.ar.turnOff()

            Toast.makeText(this, "Ar Desligado!! ${this.ar.isOn}", Toast.LENGTH_SHORT).show()

        }
    }


}


