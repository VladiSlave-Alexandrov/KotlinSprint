package lesson_16

class Player(
    val nickName: String,
    private var health: Int = 100,
    var attackPower: Int = 20
) {
    fun takeDamage(damage: Int) {
        if (attackPower <= 0) {
            println("$nickName - мертв")
        } else {
            health -= damage
            println("-$damage dmg")
            if (health <= 0) death()
        }
    }

    fun takeHeal(healPower: Int) {
        if (attackPower <= 0) {
            println("$nickName - мертв")
        } else {
            health += healPower
            println("Восстановление: $healPower едениц здоровья")
        }
    }

    private fun death() {
        attackPower = 0
        println("$nickName - мертв")
    }
}

fun main() {
    val player = Player("Володя")
    player.takeDamage(30)
    player.takeHeal(15)
    player.takeDamage(30)
    player.takeHeal(15)
    player.takeDamage(50)
    player.takeHeal(15)
    player.takeDamage(50)
    player.takeHeal(15)
}