package dz.at.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() { //here MainActivity is extended from AppCompatActivity Class powred by google
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //affect Rlayout to activitymain
        var x_value = findViewById<EditText>(R.id.editTextNumber_1)
        var y_value = findViewById<EditText>(R.id.editTextNumber_2)
        var sum_btn = findViewById<Button>(R.id.button_1)
        var mins_btn = findViewById<Button>(R.id.button_2)
        var multiple_btn = findViewById<Button>(R.id.button_3)
        var div_btn = findViewById<Button>(R.id.button_4)
        var result = findViewById<TextView>(R.id.textView_1)

        sum_btn.setOnClickListener(View.OnClickListener {
            var x = x_value.text.toString()
            var y = y_value.text.toString()

            result.text = Sum_a(x_value, y_value)


        })

        mins_btn.setOnClickListener(View.OnClickListener {
            var x = x_value.text.toString().toInt()
            var y = y_value.text.toString().toInt()
            var z = x - y
            result.text = z.toString()

        })

        multiple_btn.setOnClickListener(View.OnClickListener {
            var x = x_value.text.toString().toInt()
            var y = y_value.text.toString().toInt()
            var z = x * y
            result.text = z.toString()

        })
        div_btn.setOnClickListener(View.OnClickListener {
            var x = x_value.text.toString().toDouble()
            var y = y_value.text.toString().toDouble()
            var z = x.div(y).toFloat()


            result.text = z.toString()

        })


    }

    fun Sum_a(x_value: EditText, y_value: EditText): String {
        var z = x_value.text.toString().toInt() + y_value.text.toString().toInt()
        return z.toString()
    }
}