package jth.com.braincommerce.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import jth.com.braincommerce.data.db.dao.SampleDao
import jth.com.braincommerce.data.model.SampleEntity

@Database(
    entities = [SampleEntity::class],
    version = 1,
    exportSchema = false
)
abstract class SampleDataBae : RoomDatabase() {
   abstract fun SampleDao() : SampleDao
}