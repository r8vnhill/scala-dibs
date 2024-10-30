package cl.ravenhill
package math

def divide(a: Int, b: Int): Int = if b == 0 then
    throw new IllegalArgumentException("Cannot divide by zero")
else
    a / b

def safeDivide(a: Int, b: Int): Option[Int] = try
    Some(divide(a, b))
catch
    case e: IllegalArgumentException => None

@main def foo(): Unit =
    println(safeDivide(10, 2))
    println(safeDivide(10, 0))
    /* Output:
      Some(5)
      None
     */