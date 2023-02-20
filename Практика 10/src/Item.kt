package Items
import kotlin.random.Random

// абстрактный класс
abstract class Item(val name: String, val price: Double, val quantity: Int, val year: Int) : CheckInfo {

    open fun barcode(): Int {
        return Random.nextInt(10000, 100000)
    }

    // качество объекта
    open fun quality(): Double {
        return price / quantity
    }

    // вывод информации
    open fun info() {
        println(summary())
        println("Качество: ${quality()}")
        if (age() != 0)
            println("Возраст товара: ${age()}")
        else println("Товар поступил в этом году.")
    }
    override fun summary(): String {
        return "СВОДКА: Имя: $name, Цена: $price, Количество: $quantity, Год выпуска: $year"
    }
    override fun age(): Int {
        return 2023 - year
    }
    override fun checkSale(): String {
        return if (age() > 5) "Скидка на товар будет"
        else "Скидки на товар не будет"
    }
}

interface CheckInfo {
    fun summary(): String
    fun age(): Int
    fun checkSale(): String
}