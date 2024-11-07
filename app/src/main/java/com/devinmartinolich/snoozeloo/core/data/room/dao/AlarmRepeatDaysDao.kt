package com.devinmartinolich.snoozeloo.core.data.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface AlarmRepeatDaysDao {

    @Query("SELECT * FROM alarm_repeat_days")
    fun getAll(): List<AlarmRepeatDaysDao>

    @Query("SELECT * FROM alarm_repeat_days WHERE id IN (:alarmIds)")
    fun loadAllByIds(alarmIds: IntArray): List<AlarmRepeatDaysDao>

    @Upsert
    fun upsertDay(alarm: AlarmRepeatDaysDao)

    @Upsert
    fun upsertDays(alarms: List<AlarmRepeatDaysDao>)

    @Delete
    fun delete(alarm: AlarmRepeatDaysDao)

    @Delete
    fun delete(alarms: List<AlarmRepeatDaysDao>)
}