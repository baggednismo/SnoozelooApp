package com.devinmartinolich.snoozeloo.core.data.room.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alarms")
data class Alarms(
    @PrimaryKey(autoGenerate = true)        val id: Int,
    @ColumnInfo(name = "name")              val name: String,
    @ColumnInfo(name = "time")              val time: String,
    @ColumnInfo(name = "enabled")           val enabled: Boolean,
    @ColumnInfo(name = "ringtone")          val ringtone: String,
    @ColumnInfo(name = "ringtoneVolume")    val ringtoneVolume: Int,
    @ColumnInfo(name = "vibration")         val vibration: Boolean,
)