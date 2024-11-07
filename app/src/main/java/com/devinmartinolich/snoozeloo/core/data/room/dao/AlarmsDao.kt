package com.devinmartinolich.snoozeloo.core.data.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.devinmartinolich.snoozeloo.core.data.room.tables.Alarms
import kotlinx.coroutines.flow.Flow

@Dao
interface AlarmsDao {

    @Query("SELECT * FROM alarms")
    fun getAllAlarms(): List<Alarms>

    @Query("SELECT * FROM alarms WHERE id = :id")
    fun getAlarmById(id: Int): Alarms?

    @Upsert
    fun upsertAlarm(alarm: Alarms)

    @Delete
    fun deleteAlarm(alarm: Alarms)

    // Return the list of items ordered by datetime descending
    @Query("SELECT * FROM alarms ORDER BY time DESC")
    fun getAllAlarmsOrderedByDatetime(): Flow<List<Alarms>>

}