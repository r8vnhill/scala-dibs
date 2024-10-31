import sbt.*

/**
 * Object containing project dependencies for testing libraries.
 *
 * The `Dependencies` object provides lazy-loaded definitions for commonly used Scala testing libraries, allowing
 * centralized management of dependencies in the build configuration.
 *
 * ## Usage:
 * This object is typically imported into the build definition files (e.g., `build.sbt`) to manage test dependencies.
 * Each dependency is versioned and can be accessed by referencing the appropriate field.
 *
 * ### Example: Adding Dependencies to `build.sbt`
 * {{{
 * libraryDependencies ++= Seq(
 *   Dependencies.scalaTest,
 *   Dependencies.scalactic,
 *   Dependencies.scalaCheck
 * )
 * }}}
 */
object Dependencies {

    /** Dependency for the ScalaTest testing framework, used for unit testing. */
    lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.19"

    /** Dependency for Scalactic, used for providing helper functions and enhanced assertions in tests. */
    lazy val scalactic = "org.scalactic" %% "scalactic" % "3.2.19"

    /** Dependency for ScalaCheck integration, providing property-based testing support in ScalaTest. */
    lazy val scalaCheck = "org.scalatestplus" %% "scalacheck-1-18" % "3.2.19.0"
}
