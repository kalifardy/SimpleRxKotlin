package com.app.keyalive.simplerxkotlin

import android.database.Observable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Flowable
import io.reactivex.Single

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            io.reactivex.Observable.fromArray("kalif","ardy","rx","semarang")
//                    operator filter
//                    diambil sesuai kondisi
                    .filter { data ->data.contains("semarang") }.subscribe {
                data->
                Log.d("data:",data.toString())
            }
        //sample 2
        Flowable.just(12,12,23,34,23)
//                convert data dari string ke double
                .map { t->t.toDouble() }
//                filter data kurang dari 15
                .filter { t: Double -> t<15 }
                .subscribe { t: Double? ->
                    Log.d("data:",t.toString())
                }
//        sample 3
        
    }
}
