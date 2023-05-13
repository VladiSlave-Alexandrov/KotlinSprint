package lesson2

fun main(){
    val crystalOre = 7
    val ironOre = 11
    val buff = 20

    val buffCrystalOre = crystalOre * buff / 100
    val buffIronOre = ironOre * buff / 100

    println("Бонусной кристалической руды: $buffCrystalOre")
    println("Бонусной железной руды: $buffIronOre")
}