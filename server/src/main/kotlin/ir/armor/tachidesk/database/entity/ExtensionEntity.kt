package ir.armor.tachidesk.database.entity

/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */

import ir.armor.tachidesk.database.table.ExtensionsTable
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class ExtensionEntity(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<ExtensionEntity>(ExtensionsTable)

    var name by ExtensionsTable.name
    var pkgName by ExtensionsTable.pkgName
    var versionName by ExtensionsTable.versionName
    var versionCode by ExtensionsTable.versionCode
    var lang by ExtensionsTable.lang
    var isNsfw by ExtensionsTable.isNsfw
    var apkName by ExtensionsTable.apkName
    var iconUrl by ExtensionsTable.iconUrl
    var installed by ExtensionsTable.installed
    var classFQName by ExtensionsTable.classFQName
}
