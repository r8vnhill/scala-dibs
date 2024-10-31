import CommonSettingsPlugin.commonSettings

ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "2.13.15"

enablePlugins(CommonSettingsPlugin)

lazy val root = (project in file("."))
  .aggregate(intro)
  .settings(
      name := "scala2-dibs",
      commonSettings,
  )

lazy val intro = (project in file("intro"))
  .aggregate(exceptions)
  .settings(
      name := "intro",
      commonSettings
  )

lazy val exceptions = (project in file("intro/exceptions"))
  .settings(
      name := "exceptions",
      commonSettings,
      libraryDependencies ++= Seq(),
      idePackagePrefix := Some("cl.ravenhill")
  )

lazy val oop = (project in file("oop"))
  .aggregate(operatorOverload)
  .settings(
      name := "oop",
      commonSettings
  )

lazy val operatorOverload = (project in file("oop/operator-overload"))
  .settings(
      name := "operator-overload",
      commonSettings,
      libraryDependencies ++= Seq(),
      idePackagePrefix := Some("cl.ravenhill")
  )

lazy val fp = project in file("fp")
