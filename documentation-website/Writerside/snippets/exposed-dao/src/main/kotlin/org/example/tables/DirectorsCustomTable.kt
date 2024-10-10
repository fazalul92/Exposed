package org.example.tables

import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IdTable
import org.jetbrains.exposed.sql.Column

const val MAX_ID_LENGTH = 32
const val MAX_DIRECTOR_NAME_LENGTH = 32

object DirectorsCustomTable : IdTable<String>() {
    override val id: Column<EntityID<String>> = varchar("id", MAX_ID_LENGTH).entityId()
    val name = varchar("name", MAX_DIRECTOR_NAME_LENGTH)

    override val primaryKey = PrimaryKey(id)
}
