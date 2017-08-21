package com.guilhermeantonio.threads

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import java.util.*
import java.util.concurrent.CyclicBarrier

class MainActivity : AppCompatActivity() {

    private var timer: Timer? = null
    private var timerTask: TimerTask? = null
    private var handler: Handler? = Handler()
    var metros = 0
    var distancia1 = 0
    var distancia2 = 0
    var distancia3 = 0
    var distancia4 = 0
    var distancia5 = 0
    var pos1 = ""
    var pos2 = ""
    var pos3 = ""
    var pos4 = ""
    var pos5 = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        iniciar.setOnClickListener {


            Sapo1().start()
            Sapo2().start()
            Sapo3().start()
            Sapo4().start()
            Sapo5().start()


        }


    }


    inner class Sapo1 : Thread() {


        override fun start() {
            super.start()

            var t = true

            while (t) {

                if (metros == 10000) {

                    t = false

                    sapo1.text = "Sapo 1"


                }

                metros += 100


            }


        }


    }

    inner class Sapo2 : Thread() {

        override fun start() {
            super.start()

            var t = true

            while (t) {

                if (metros == 10000) {


                    t = false

                    sapo2.text = "Sapo 2"


                }

                metros += 100


            }
        }


    }

    inner class Sapo3 : Thread() {

        override fun start() {
            super.start()

            var t = true

            while (t) {

                if (metros == 10000) {


                    t = false

                    sapo3.text = "Sapo 3"


                }

                metros += 100


            }
        }


    }

    inner class Sapo4 : Thread() {

        override fun start() {
            super.start()

            var t = true

            while (t) {

                if (metros == 10000) {


                    t = false

                    sapo4.text = "Sapo 4"


                }

                metros += 100


            }
        }


    }

    inner class Sapo5 : Thread() {

        override fun start() {
            super.start()

            var t = true

            while (t) {

                if (metros == 10000) {

                    t = false

                    sapo5.text = "Sapo 5"


                }

                metros += 100


            }
        }


    }

    class Distancia {

        var distancia = 0

    }

}
