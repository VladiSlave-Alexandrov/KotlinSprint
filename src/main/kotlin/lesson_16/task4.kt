package lesson_16

class Order(
    private val orderNumber: Int,
    var orderAvailability: Boolean = false,
) {
    private fun prepareOrderForDelivery() {
        orderAvailability = true
        println("Ваш заказ готов к выдаче")
    }

    fun submitRequest(availability: Boolean) {
        if (availability) prepareOrderForDelivery()
        else println("Заказ еще не готов")
    }
}

fun main() {
    val order = Order(1)
    order.submitRequest(true)
}