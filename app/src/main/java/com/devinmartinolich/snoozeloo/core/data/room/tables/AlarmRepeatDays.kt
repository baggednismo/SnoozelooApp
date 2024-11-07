package com.devinmartinolich.snoozeloo.core.data.room.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alarm_repeat_days")
data class AlarmRepeatDays(
    @PrimaryKey(autoGenerate = true)        val id: Int,
    @ColumnInfo(name = "alarmId")           val alarmId: Int,
    @ColumnInfo(name = "day")               val day: Int,
)