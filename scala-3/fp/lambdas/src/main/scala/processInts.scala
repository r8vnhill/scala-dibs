package cl.ravenhill

private def processInts(a: Int, b: Int, operation: (Int, Int) => Int): Int =
    operation(a, b)

@main def testProcessInts(): Unit =
    val sum = processInts(3, 4, _ + _)
    println(sum)
    /* Output:
    7
    */
