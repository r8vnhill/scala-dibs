// Set the Scala version used across the entire build
ThisBuild / scalaVersion := "3.7.1"

// Define the organization and root project name
ThisBuild / organization := "cl.ravenhill"
ThisBuild / name := "scala-dibs"

// Common compiler options to enable useful warnings and ensure consistent encoding
lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-deprecation", // Warn about the use of deprecated APIs
    "-unchecked", // Enable additional warnings where generated code depends on assumptions
    "-feature", // Warn when using features that need to be explicitly imported
    "-explain", // Provide explanations for type errors
    "-encoding",
    "utf8" // Set UTF-8 encoding for source files
  )
)

// Leaf module that contains examples for product types (e.g., tuples, case classes)
// Located under type-fundamentals/algebraic-data-types/product
lazy val product = project
  .in(file("type-fundamentals/algebraic-data-types/product"))
  .settings(commonSettings*)
  .settings(libraryDependencies += "javax.inject" % "javax.inject" % "1")

// Intermediate module that groups all algebraic data types (ADTs)
// Aggregates and depends on the productTypes module
lazy val algebraicDataTypes = project
  .in(file("type-fundamentals/algebraic-data-types"))
  .aggregate(product)
  .dependsOn(product)
  .settings(commonSettings*)

// High-level module that groups all type fundamentals
// Aggregates and depends on algebraicDataTypes
lazy val typeFundamentals = project
  .in(file("type-fundamentals"))
  .aggregate(algebraicDataTypes)
  .dependsOn(algebraicDataTypes)
  .settings(commonSettings*)

// Root project: aggregates everything but is not published
// Useful for local development and IDE import
lazy val root = project
  .in(file("."))
  .aggregate(typeFundamentals)
  .settings(commonSettings*)
  .settings(publish / skip := true) // Do not publish this aggregation-only root
