package tw.edu.pu.csim.s1082835.hello2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv: TextView = findViewById<TextView>(R.id.txv)
        //txv.text = "Hello Jenny~"

        //TestMaster() //呼叫方法
        //TestDEV()
        txv.setText("嗨，我是陳盈如");

    }

    fun TestMaster(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Master分支"
    }

    fun TestDEV(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Dev分支"
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "jenny修改螢幕觸控"
        return true
    }

}