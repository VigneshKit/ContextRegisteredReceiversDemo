package com.example.contextregisteredreceiversdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "AIR PLANE MODE CHANGED", Toast.LENGTH_LONG).show()
    }
}