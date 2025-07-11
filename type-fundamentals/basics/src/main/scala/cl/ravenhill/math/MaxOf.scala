package cl.ravenhill.math

def maxOf(a: Int, b: Int): Int = if a > b then a else b

@main def maxOfExample(): Unit =
  val x: Unit = if 1 > 2 then 1
  println(x) // Prints: ()
end maxOfExample
