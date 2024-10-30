package cl.ravenhill

@main def mainFilter(): Unit =
    val numbers = List(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter(_ % 2 == 0)
    println(evenNumbers)
