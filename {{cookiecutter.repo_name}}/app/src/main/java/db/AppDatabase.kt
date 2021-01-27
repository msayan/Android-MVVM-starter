package {{ cookiecutter.package_name }}.db

import androidx.room.Database
import androidx.room.RoomDatabase
import {{ cookiecutter.package_name }}.db.dao.ExampleDao
import {{ cookiecutter.package_name }}.db.entity.ExampleEntity

@Database(entities = [ExampleEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}