package cl.ravenhill

object Add {
    private val add: (Int, Int) => Int = (x: Int, y: Int) => x + y

    private val add2: Int => Int = add(2, _)

    def main(args: Array[String]): Unit = {
        println(add2(3))
        /* Output:
        5
        */
    }
}
