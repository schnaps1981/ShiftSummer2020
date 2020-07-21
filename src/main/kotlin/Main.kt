fun main() {
    val city = City(getCityName(), getTemperature())
    city.writeWeather()
}

private fun getCityName(): String {
    println("Укажите свой город")
    val input = readLine()

    return if (input.isNullOrEmpty()) {
        println("ошибка при вводе, повнимательнее!")
        getCityName()
    } else
        input
}

private fun getTemperature(): Double {
    println("Укажите температуру сегодня")
    readLine()?.toDoubleOrNull()?.let { return it }

    println("Температура должна быть числом!")
    return getTemperature()
}
