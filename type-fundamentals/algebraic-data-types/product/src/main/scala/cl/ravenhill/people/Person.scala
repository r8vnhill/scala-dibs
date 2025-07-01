package cl.ravenhill.people

/** Represents a person with a name and an optional age.
  *
  * This class demonstrates the use of a primary constructor and a secondary constructor. If only a name is provided,
  * age defaults to 0. If both name and age are provided, the secondary constructor initializes both fields.
  *
  * @param name
  *   The name of the person.
  */
class Person(val name: String):
  var age: Int = 0

  /** Secondary constructor to initialize both name and age.
    *
    * @param name
    *   The name of the person.
    * @param age
    *   The age of the person.
    */
  def this(name: String, age: Int) =
    this(name)
    this.age = age
  end this
end Person

@main def personExample(): Unit =
  // Create a Person instance with just a name
  val person1 = Person(name = "Alice")
  println(s"Name: ${person1.name}, Age: ${person1.age}") // Prints: Name: Alice, Age: 0

  // Create a Person instance with a name and age
  val person2 = Person(name = "Bob", age = 30)
  println(s"Name: ${person2.name}, Age: ${person2.age}") // Prints: Name: Bob, Age: 30
end personExample
