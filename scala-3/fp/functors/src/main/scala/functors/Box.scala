package cl.ravenhill
package functors

case class Box[A](value: A)

given BoxFunctor: Functor[Box] with
    def map[A, B](fa: Box[A])(f: A => B): Box[B] = Box(f(fa.value))
