package cl.ravenhill
package complex

class Complex(val real: Double, val imaginary: Double) {
    def +(that: Complex): Complex =
        new Complex(real + that.real, imaginary + that.imaginary)
}

object ComplexImplicits {
    implicit class ComplexOps(c: Complex) {
        def +(d: Double): Complex = new Complex(c.real + d, c.imaginary)
    }
}
