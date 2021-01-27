package {{ cookiecutter.package_name }}.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import {{ cookiecutter.package_name }}.db.entity.ExampleEntity

@Dao
interface ExampleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(exampleEntity: ExampleEntity)
}