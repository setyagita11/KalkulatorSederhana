package com.zubet.kalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tambah: Button
    private lateinit var kurang: Button
    private lateinit var kali: Button
    private lateinit var bagi: Button
    private lateinit var bil1: EditText
    private lateinit var bil2: EditText
    private lateinit var hasil: TextView
    private lateinit var reset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tambah = findViewById(R.id.btnplus)
        kurang = findViewById(R.id.btnminus)
        kali = findViewById(R.id.btnkali)
        bagi = findViewById(R.id.btnbagi)
        bil1 = findViewById(R.id.bilangan1)
        bil2 = findViewById(R.id.bilangan2)
        hasil = findViewById(R.id.txthasil)
        reset = findViewById(R.id.btnreset)

        tambah.setOnClickListener { plus() }
        kurang.setOnClickListener { minus() }
        kali.setOnClickListener { kali() }
        bagi.setOnClickListener { bagi() }
        reset.setOnClickListener { reset() }
    }

    fun plus(){
        val hitung = bil1.text.toString().toDouble() + bil2.text.toString().toDouble()
        hasil.text = hitung.toString()
    }

    fun minus(){
        val hitung2 = bil1.text.toString().toDouble() - bil2.text.toString().toDouble()
        hasil.text = hitung2.toString()
    }

    fun kali(){
        val hitung3 = bil1.text.toString().toDouble() * bil2.text.toString().toDouble()
        hasil.text = hitung3.toString()
    }

    fun bagi(){
        val hitung4 = bil1.text.toString().toDouble() / bil2.text.toString().toDouble()
        hasil.text = hitung4.toString()
    }

    fun reset(){
        hasil.text = 0.toString()
        bil1.text.clear()
        bil2.text.clear()
    }

}