package cl.ravenhill

object ProcessInts {
    private def processInts(a: Int, b: Int, operation: (Int, Int) => Int): Int =
        operation(a, b)

    def main(args: Array[String]): Unit = {
        val sum = processInts(3, 4, _ + _)
        println(sum)
        /* Output:
        7
        */
    }
}
