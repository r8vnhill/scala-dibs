package cl.ravenhill.people

import scala.annotation.targetName

/** Represents a person with a name and an optional age.
  *
  * This class demonstrates the use of a primary constructor and a secondary constructor. If only a name is provided,
  * age defaults to 0. If both name and age are provided, the secondary constructor initializes both fields.
  *
  * @param name
  *   The name of the person.
  */
class Person @targetName("createPerson") private (val name: String):
  require(name.nonEmpty, "Name cannot be empty")

  var age: Int = 0

  def this(name: String, age: Int) =
    this(name)
    this.age = age
  end this
end Person

@main def personExample(): Unit =
  ???
end personExample
