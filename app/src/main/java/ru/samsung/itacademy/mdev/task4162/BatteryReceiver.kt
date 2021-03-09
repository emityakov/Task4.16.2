package ru.samsung.itacademy.mdev.task4162

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BatteryReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Battery level: " +
                intent.getStringExtra("Battery"),
            Toast.LENGTH_LONG).show();
    }
}
