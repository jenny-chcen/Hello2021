package tw.edu.pu.csim.s1082835.hello2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv: TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello Jenny~"
        TestDEV() //呼叫方法
    }
    fun TestDEV(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Dev分支"
    }

}