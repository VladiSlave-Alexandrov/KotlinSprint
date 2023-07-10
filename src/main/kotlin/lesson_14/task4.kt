package lesson_14

open class SpaceObject(
    val name: String,
    val plantability: Boolean,
    val radiatesLight: Boolean,
) {}

open class Planet(
    name: String,
    plantability: Boolean,
    radiatesLight: Boolean,
    val satelliteAvailability: Boolean,
    val habitability: Boolean,
    val atmosphere: Boolean,
    val water: Boolean,
) : SpaceObject(name, plantability, radiatesLight) {
    val satelliteList: MutableList<Satellite> = mutableListOf()

    fun printSatelliteInfo() {
        println("Планета: $name\nЕё спутники:")
        satelliteList.forEach { print("${it.name} ") }
    }
}

class Satellite(
    name: String,
    plantability: Boolean,
    radiatesLight: Boolean,
    satelliteAvailability: Boolean,
    atmosphere: Boolean,
    habitability: Boolean,
    water: Boolean,
    val hostPlanet: Planet
) : Planet(name, plantability, radiatesLight, satelliteAvailability, atmosphere, habitability, water) {

}

fun main() {
    val planet1 = Planet("C137", true, false, true, true, true, true)
    val satellite1 = Satellite("C137-01", true, false, false, true, true, true, planet1)
    val satellite2 = Satellite("C137-02", true, false, false, false, false, false, planet1)
    planet1.satelliteList.add(satellite1)
    planet1.satelliteList.add(satellite2)
    planet1.printSatelliteInfo()
}