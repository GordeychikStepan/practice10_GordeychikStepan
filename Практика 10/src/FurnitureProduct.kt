import Items.*

class FurnitureProduct(name: String, price: Double, quantity: Int, year: Int, var material: String) : Item(name, price, quantity, year) {

    // качество
    override fun quality(): Double {
        val curYear = 2023
        val quality = super.quality()
        return quality + 0.5 * (curYear - year)
    }

    override fun summary(): String {
        return "СВОДКА:\nИмя: $name, Цена: $price, Количество: $quantity, Год выпуска: $year, Материал: $material"
    }

    fun getDays() {
        if (year == 2023) {
            return
        }
        else {
            val days = (2023 - this.year) * 365
            println("Товар на складе уже $days дней")
        }
    }

}