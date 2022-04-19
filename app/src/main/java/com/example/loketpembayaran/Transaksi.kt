package com.example.loketpembayaran

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Transaksi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transaksi, container, false)
    }

    companion object {
        fun newInstance() : Transaksi{
            val frg = Transaksi()
            val args = Bundle()
            frg.arguments = args
            return frg
        }
    }

}