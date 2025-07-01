package cl.ravenhill.geom

/** Represents a 2D position using integer coordinates.
  *
  * This class defines a simple product type composed of two values: `x` and `y`. It also includes a helper method to
  * determine whether the position is at the origin (0, 0).
  *
  * <h2>Usage:</h2>
  *
  * Useful for representing positions in grids, game maps, or coordinate systems.
  *
  * @param x
  *   The horizontal coordinate.
  * @param y
  *   The vertical coordinate.
  */
class Position(val x: Int, val y: Int):

  /** Returns `true` if this position is at the origin (0, 0). */
  def isOrigin: Boolean =
    x == 0 && y == 0
  end isOrigin
end Position

@main def positionExample(): Unit =
  // Create a position at coordinates (541, 133)
  val pos = Position(x = 541, y = 133)

  // Access and print the x-coordinate
  println(pos.x) // Prints: 541

  // Access and print the y-coordinate
  println(pos.y) // Prints: 133

  // Check if the position is at the origin
  println(pos.isOrigin) // Prints: false
end positionExample
