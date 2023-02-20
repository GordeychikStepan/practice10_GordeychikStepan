import kotlin.system.exitProcess

fun main() {

    val product1 = createFurnitureProduct()
    println()

    product1.info()
    // перевод год-дни
    product1.getDays()
    println("Штрих-код: ${product1.barcode()}")
    println(product1.checkSale())

    println()

    val product2 = createPCProduct()
    println()

    product2.info()
    // общая стоимость товаров
    product2.totalCost()
    println("Штрих-код: ${product2.barcode()}")
    println(product2.checkSale())
}

fun createFurnitureProduct(): FurnitureProduct {
    println("Добавление товара (мебель)")
    try {
        print("Введите имя: ")
        val name = readLine().toString()

        print("Введите цену: ")
        val price = readLine()!!.toDouble()
        if (price < 0) throw Exception()

        print("Введите количество: ")
        val quantity = readLine()!!.toInt()
        if (quantity < 0) throw Exception()

        print("Введите год выпуска: ")
        val year = readLine()!!.toInt()
        if (year < 1999 || year > 2023) throw Exception()

        print("Введите материал: ")
        val material = readLine().toString()

        if (name.isBlank() || material.isBlank()) throw Exception()

        return FurnitureProduct(name, price, quantity, year, material)
    }
    catch (e: Exception) {
        println("Ошибка ввода данных")
        exitProcess(0)
    }
}

fun createPCProduct(): PCProduct {
    println("Добавление товара (компьютерные комплектующие)")
    try {
        print("Введите имя: ")
        val name = readLine().toString()

        print("Введите цену: ")
        val price = readLine()!!.toDouble()
        if (price < 0) throw Exception()

        print("Введите количество: ")
        val quantity = readLine()!!.toInt()
        if (quantity < 0) throw Exception()

        print("Введите год выпуска: ")
        val year = readLine()!!.toInt()
        if (year < 1999 || year > 2023) throw Exception()

        print("Введите фирму-производителя: ")
        val fabricator = readLine().toString()

        if (name.isBlank() || fabricator.isBlank()) throw Exception()

        return PCProduct(name, price, quantity, year, fabricator)
    }
    catch (e: Exception) {
        println("Ошибка ввода данных")
        exitProcess(0)
    }
}