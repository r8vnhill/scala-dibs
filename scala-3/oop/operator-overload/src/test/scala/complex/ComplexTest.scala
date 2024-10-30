package cl.ravenhill
package complex

import org.scalacheck.Gen
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class ComplexTest extends AnyFreeSpec with Matchers with ScalaCheckPropertyChecks:
    "A complex number" - {
        "when adding it to another complex number" - {
            "then the real part should be the sum of the real parts" in {
                forAll(genComplex, genComplex) { (c1, c2) =>
                    val c3 = c1 + c2
                    c3.real shouldBe c1.real + c2.real
                }
            }

            "then the imaginary part should be the sum of the imaginary " +
              "parts" in {
                forAll(genComplex, genComplex) { (c1, c2) =>
                    val c3 = c1 + c2
                    c3.imaginary shouldBe c1.imaginary + c2.imaginary
                }
            }
        }

        "when adding it to a real number" - {
            "then the real part should be the sum of the real part and the " +
              "real number" in {
                forAll(genComplex, Gen.choose(-100.0, 100.0)) { (c, d) =>
                    val c2 = c + d
                    c2.real shouldBe c.real + d
                }
            }

            "then the imaginary part should remain unchanged" in {
                forAll(genComplex, Gen.choose(-100.0, 100.0)) { (c, d) =>
                    val c2 = c + d
                    c2.imaginary shouldBe c.imaginary
                }
            }
        }
    }

    private def genComplex: Gen[Complex] =
        Gen.zip(Gen.choose(-100.0, 100.0), Gen.choose(-100.0, 100.0))
          .map(Complex.apply.tupled)
