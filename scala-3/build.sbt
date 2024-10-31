import CommonSettingsPlugin.commonSettings

ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "3.5.1"

enablePlugins(CommonSettingsPlugin)

lazy val root = (project in file("."))
  .aggregate(intro)
  .settings(
      name := "scala3-dibs",
      commonSettings,
  )

lazy val intro = project in file("intro")

lazy val testing = (project in file("testing"))
  .aggregate(pbt)
  .settings(
      name := "testing",
      commonSettings
  )

lazy val pbt = (project in file("testing/pbt"))
  .aggregate(biggest)
  .settings(
      name := "pbt",
      commonSettings,
  )

lazy val biggest = (project in file("testing/pbt/biggest"))
  .settings(
      name := "biggest",
      commonSettings,
      idePackagePrefix := Some("cl.ravenhill")
  )

lazy val oop = (project in file("oop"))
  .aggregate(openFinal, operatorOverload)
  .settings(
      name := "oop",
      commonSettings
  )

lazy val openFinal = (project in file("oop/open-final"))
  .settings(
      name := "open-final",
      commonSettings,
      libraryDependencies ++= Seq(),
      idePackagePrefix := Some("cl.ravenhill")
  )

lazy val operatorOverload = (project in file("oop/operator-overload"))
  .settings(
      name := "operator-overload",
      commonSettings,
      libraryDependencies ++= Seq(),
      idePackagePrefix := Some("cl.ravenhill")
  )

lazy val fp = project in file("fp")
