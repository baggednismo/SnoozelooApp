package com.devinmartinolich.snoozeloo.core.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.devinmartinolich.snoozeloo.core.data.room.dao.AlarmRepeatDaysDao
import com.devinmartinolich.snoozeloo.core.data.room.dao.AlarmsDao
import com.devinmartinolich.snoozeloo.core.data.room.tables.AlarmRepeatDays
import com.devinmartinolich.snoozeloo.core.data.room.tables.Alarms

@Database(
    entities = [
        Alarms::class,
        AlarmRepeatDays::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AlarmsDatabase: RoomDatabase() {

    abstract val alarmsDao: AlarmsDao
    abstract val alarmRepeatDaysDao: AlarmRepeatDaysDao

}