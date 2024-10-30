package cl.ravenhill
package iterables

import iterables.IntListUtils.biggest

import org.scalacheck.Gen
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class IntListTest extends AnyFreeSpec with ScalaCheckPropertyChecks
  with should.Matchers:
    "An integer list" - {
        "when getting the biggest element" - {
            "should return the last element of a sorted list" in {
                forAll(Gen.listOf(Gen.choose(0, 100))) { list =>
                    whenever(list.nonEmpty) {
                        //noinspection SortedHeadLast
                        biggest(list) shouldBe list.sorted.last
                    }
                }
            }
        }
    }
