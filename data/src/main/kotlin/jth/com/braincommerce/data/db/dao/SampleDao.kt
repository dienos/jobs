package jth.com.braincommerce.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import jth.com.braincommerce.data.model.SampleEntity

@Dao
interface SampleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: SampleEntity)

    @Query("SELECT * FROM sample")
    suspend fun getSamples(): List<SampleEntity>
}