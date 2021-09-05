package ru.grandi.bambino.remembermeplease.data.model

import java.util.*

data class User(
    val id: Int,
    val name: String,
    val surname: String,
    val age: Int,
    val dataBirthday: Date?
)