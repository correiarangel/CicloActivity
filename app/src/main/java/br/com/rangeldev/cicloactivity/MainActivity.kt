package br.com.rangeldev.cicloactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        msgToast("Activity em onCreate()")
        println(">)))@> onCreate()")

    }

    override fun onStart() {
        super.onStart()
        msgToast("Activity em onStart()....")
        println(">)))@> onStart()")
    }

    override fun onResume() {
        super.onResume()
        msgToast("Activity em onResume().....")
        println(">)))@> onStart()")
    }

    override fun onPause() {
        super.onPause()
        msgToast("Activity em onPause().....")
        println(">)))@> onStart()")
    }

    override fun onStop() {
        super.onStop()
        msgToast("Activity em onStop()...")
        println(">)))@> onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        msgToast("Activity em onRestart() ...")
        println(">)))@> onRestart()")
    }
    override fun onDestroy() {
        super.onDestroy()
        msgToast("Activity em onDestroy() ...")
        println(">)))@> onDestroy()")
        println("DESTRUIDO ACTIVITY :[")
    }

    fun msgToast(msg:String){
       var toast = Toast.makeText(
           applicationContext,msg,Toast.LENGTH_SHORT)
       toast.show()
    }

}
