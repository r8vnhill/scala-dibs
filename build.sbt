ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "3.6.1"

lazy val root = (project in file("."))
  .settings(
    name := "scala-dibs",
    idePackagePrefix := Some("cl.ravenhill")
  )
