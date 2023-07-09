package lesson_14

open class SpaceObjects(
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
) : SpaceObjects(name, plantability, radiatesLight) {

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
    println(
        """Планета: ${planet1.name}
        |Спутники: ${satellite1.name}, ${satellite2.name}
    """.trimMargin()
    )
}