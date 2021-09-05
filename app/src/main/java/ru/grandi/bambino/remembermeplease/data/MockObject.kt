package ru.grandi.bambino.remembermeplease.data

import ru.grandi.bambino.remembermeplease.data.model.User
import java.util.*

object MockObject {

    fun mockUsers() =
        listOf(
            User(1, "Петя", "Филатов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(2, "Вася", "Карташов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(3, "Захар", "Крикунов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(4, "Кирилл", "Фадеев", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(5, "Саня", "Зайнудинов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(6, "Фил", "Пилигримов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(7, "Матвей", "Матвиенко", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(2, "Вася", "Карташов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(3, "Захар", "Крикунов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(4, "Кирилл", "Фадеев", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(5, "Саня", "Зайнудинов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(6, "Фил", "Пилигримов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(5, "Саня", "Зайнудинов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(6, "Фил", "Пилигримов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(7, "Матвей", "Матвиенко", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(2, "Вася", "Карташов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(3, "Захар", "Крикунов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(4, "Кирилл", "Фадеев", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(5, "Саня", "Зайнудинов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(6, "Фил", "Пилигримов", 23, GregorianCalendar(2000, 12, 1).gregorianChange),
            User(7, "Матвей", "Матвиенко", 23, GregorianCalendar(2000, 12, 1).gregorianChange)
        )
}