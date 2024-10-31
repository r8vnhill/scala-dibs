package cl.ravenhill
package functors

case class Box[A](value: A)

object BoxFunctor extends Functor[Box] {
    def map[A, B](fa: Box[A])(f: A => B): Box[B] = Box(f(fa.value))
}
