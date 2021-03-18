package dz.at.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*

class MainActivityPizza : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pizza)
        var pizza_btn = findViewById<Button>(R.id.button)
        var x = findViewById<RadioButton>(R.id.radioButton2)
        var y = findViewById<RadioButton>(R.id.radioButton4)
        var z = findViewById<RadioButton>(R.id.radioButton5)
        var a = findViewById<CheckBox>(R.id.checkBox_1)
        var b = findViewById<CheckBox>(R.id.checkBox2)
        var c = findViewById<CheckBox>(R.id.CheckBox_3)
        var msg: String = "Please Choose your Pizza size"
        var somme: Int = 0


        pizza_btn.setOnClickListener(View.OnClickListener {
            if (x.isChecked()) {
                msg = "You have choose " + x.getText().toString() +" Pizza Size"
                somme = 800

                if (a.isChecked()) somme = somme + 5
                if (b.isChecked()) somme = somme + 5
                if (c.isChecked()) somme = somme + 5



            } else if (y.isChecked()) {
                msg = "You have choose " + y.getText().toString() +" Pizza Size"
                somme = 600

                if (a.isChecked()) somme = somme + 5
                if (b.isChecked()) somme = somme + 5
                if (c.isChecked()) somme = somme + 5


            } else if (z.isChecked()) {
                msg = "You have choose " + z.getText().toString() +" Pizza Size"
                somme = 300

                if (a.isChecked()) somme = somme + 5
                if (b.isChecked()) somme = somme + 5
                if (c.isChecked()) somme = somme + 5


            }

            somme.toString()
            Toast.makeText(this, msg +" [The Total is "+ somme +" Dz]", Toast.LENGTH_LONG).show()


        })


    }


}