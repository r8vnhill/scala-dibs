package cl.ravenhill

object NestedSums {
    def main(args: Array[String]): Unit = {
        val nestedPairs = List((1, (2, 3)), (4, (5, 6)))
        val sums = nestedPairs.map { case (x, (y, z)) => x + y + z }
        println(sums)
        /* Output:
        List(6, 15)
        */
    }
}
