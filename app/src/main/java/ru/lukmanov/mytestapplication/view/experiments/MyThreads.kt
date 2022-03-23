package ru.lukmanov.mytestapplication.view.experiments

import android.os.Looper

class MyThread : Thread() {
    override fun run() {
        Looper.prepare()
        Looper.loop()
    }
}