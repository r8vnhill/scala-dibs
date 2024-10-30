package cl.ravenhill

val add = (x: Int, y: Int) => x + y

val add2 = add(2, _)

@main def testAdd2(): Unit =
    println(add2(3))
