package cl.ravenhill
package functors

import org.scalacheck.Gen
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class BoxFunctorTest extends AnyFreeSpec with should.Matchers
  with ScalaCheckPropertyChecks:
    "Given a generic Box" - {
        "when mapping the identity function" - {
            "should return the same Box" in {
                forAll(Gen.choose(Int.MinValue, Int.MaxValue)) { value =>
                    val box = Box(value)
                    BoxFunctor.map(box)(identity) shouldBe box
                }
            }
        }

        "when composing two functions" - {
            "should return the same result as applying them sequentially" in {
                forAll(
                    Gen.choose(Int.MinValue, Int.MaxValue),
                    Gen.function1[Int, Int](Gen.choose(Int.MinValue, Int.MaxValue)),
                    Gen.function1[Int, Int](Gen.choose(Int.MinValue, Int.MaxValue))
                ) { (value, f, g) =>
                    val box = Box(value)
                    BoxFunctor.map(BoxFunctor.map(box)(f))(g) shouldBe
                      BoxFunctor.map(box)(f andThen g)
                }
            }
        }
    }
