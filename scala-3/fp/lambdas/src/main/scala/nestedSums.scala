package cl.ravenhill

@main def testNestedSums(): Unit =
    val nestedSums = List((1, (2, 3)), (4, (5, 6)))
    val sums = nestedSums.map { case (x, (y, z)) => x + y + z }
    println(sums)
    /* Output:
    List(6, 15)
    */
