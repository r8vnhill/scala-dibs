package cl.ravenhill

@main def testSumPairs(): Unit =
    val pairs = List((1, 2), (3, 4), (5, 6))
    val sums = pairs.map((x, y) => x + y)
    println(sums)
    /* Output:
    List(3, 7, 11)
    */
