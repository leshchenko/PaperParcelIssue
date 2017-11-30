package com.leshchenko.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import paperparcel.PaperParcel
import paperparcel.PaperParcelable
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

@PaperParcel data class State(
        val count: Int,
        val modificationDate: Date
) : PaperParcelable {
    @Transient
    val somethingToExclude = 10000L

    companion object {
        @JvmField
        val CREATOR = PaperParcelState.CREATOR
    }
}
