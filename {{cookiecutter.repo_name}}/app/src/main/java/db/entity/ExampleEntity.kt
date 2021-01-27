package {{ cookiecutter.package_name }}.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExampleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 1
)