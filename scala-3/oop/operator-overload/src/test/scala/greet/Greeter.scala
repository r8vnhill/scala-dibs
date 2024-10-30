package cl.ravenhill
package greet

class Greeter(val greeting: String):
    def apply(name: String): String = s"$greeting, $name!"
