package site.derker.alist.alist.android.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import site.derker.alist.alist.android.model.stationconfig.StationConfig
import java.util.*

/**
 * 资源站点
 */
@Entity
data class Station(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var name: String,
    var icon: String,
    var type: StationType,
    var config: StationConfig,
    var createdTime: Date?,
    var modifiedTime: Date?,
)
