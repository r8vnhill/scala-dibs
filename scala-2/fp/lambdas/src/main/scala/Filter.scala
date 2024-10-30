package cl.ravenhill

object Filter {
    def main(args: Array[String]): Unit = {
        val numbers = List(1, 2, 3, 4, 5)
        val evenNumbers = numbers.filter(_ % 2 == 0)
        println(evenNumbers)
        /* Output:
        List(2, 4)
        */
    }
}
