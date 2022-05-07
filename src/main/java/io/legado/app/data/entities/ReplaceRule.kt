package io.legado.app.data.entities





//@Parcelize
//@Entity(
//    tableName = "replace_rules",
//    indices = [(Index(value = ["id"]))]
//)
data class ReplaceRule(
//    @PrimaryKey(autoGenerate = true)
    var id: Long = System.currentTimeMillis(),
    var name: String = "",
    var group: String? = null,
    var pattern: String = "",
    var replacement: String = "",
    var scope: String? = null,
    var isEnabled: Boolean = true,
    var isRegex: Boolean = true,
//    @ColumnInfo(name = "sortOrder")
    var order: Int = 0
)