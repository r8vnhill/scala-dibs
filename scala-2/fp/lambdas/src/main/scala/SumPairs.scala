package cl.ravenhill

object SumPairs {
    def main(args: Array[String]): Unit = {
        val pairs = List((1, 2), (3, 4), (5, 6))
        val sums = pairs.map { case (x: Int, y: Int) => x + y }
        println(sums)
        /* Output:
        List(3, 7, 11)
         */
    }
}
