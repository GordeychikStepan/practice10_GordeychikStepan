import Items.*

class PCProduct(name: String, price: Double, quantity: Int, year: Int, var fabricator: String)
    : Item(name, price, quantity, year) {

    // качество
    override fun quality(): Double {
        val curYear = 2023
        val quality = super.quality()
        return quality + 0.5 * (curYear - year)
    }

    override fun summary(): String {
        return "СВОДКА:\nИмя: $name, Цена: $price, Количество: $quantity, Год выпуска: $year, Произваодитель $fabricator"
    }

    fun totalCost() {
        println("Общая стоимоть товаров: ${this.price * this.quantity}")
    }
}