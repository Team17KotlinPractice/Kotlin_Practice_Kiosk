package com.example.kotlin_practice_team17_kiosk

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalTime

class TimeChecker {
    @RequiresApi(Build.VERSION_CODES.O)
    fun checkTimeRage(): Boolean {
        var localTimeNow = LocalTime.now()

        val startTime = LocalTime.of(22, 0) // 오후 10시
        val endTime = LocalTime.of(23, 0)   // 오후 11시

        return localTimeNow in startTime..endTime
    }
}