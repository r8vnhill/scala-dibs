package cl.ravenhill
package complex

import scala.annotation.targetName

class Complex(val real: Double, val imaginary: Double):
    @targetName("add")
    def +(that: Complex): Complex =
        Complex(real + that.real, imaginary + that.imaginary)

extension (c: Complex)
    @targetName("add")
    def +(d: Double): Complex = Complex(c.real + d, c.imaginary)
