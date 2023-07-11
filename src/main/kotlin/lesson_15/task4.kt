package lesson_15

abstract class Instruments(
    val typeName: String,
    val modelName: String,
    val quantityStock: Int,
) : SearchRelatedProduct {}

abstract class Components(
    val typeName: String,
    val modelName: String,
    val quantityStock: Int,
    val appropriateInstruments: Instruments,
) {}

interface SearchRelatedProduct {
    fun searchProduct() {
        println("Выполняется поиск")
    }
}

class ElectricGuitar(
    typeName: String,
    modelName: String,
    quantityStock: Int,
    val pickupType: String,
    val formType: String
) : Instruments(typeName, modelName, quantityStock) {}

class BassGuitar(
    typeName: String,
    modelName: String,
    quantityStock: Int,
    val pickupType: String,
    val numberStrings: Int
) : Instruments(typeName, modelName, quantityStock) {}

class Mediator(
    typeName: String,
    modelName: String,
    quantityStock: Int,
    appropriateInstruments: ElectricGuitar,
) : Components(typeName, modelName, quantityStock, appropriateInstruments) {}

class BassGuitarStrings(
    typeName: String,
    modelName: String,
    quantityStock: Int,
    appropriateInstruments: BassGuitar,
) : Components(typeName, modelName, quantityStock, appropriateInstruments) {}

fun main() {
    val guitar = ElectricGuitar(
        "Электро-Гитара",
        "PRS Custom 24",
        3,
        "P-90,",
        "СуперСтрат"
    )
    guitar.searchProduct()
}

