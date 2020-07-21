data class City(val cityName: String, val cityTemp : Double)

fun City.writeWeather()
        = println("В городе ${this.cityName} Температура ${this.cityTemp} и это ${weatherCondition(this.cityTemp)}")

private fun weatherCondition(temperature: Double): String {
    return when (temperature) {
        in -50f..15f -> "холодно"
        in 15f..25f -> "нормально"
        in 25f..50f -> "жарко"
        else -> "катастрофа"
    }
}