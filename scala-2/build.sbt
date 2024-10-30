ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "2.13.15"

lazy val commonSettings = Seq(
    scalacOptions ++= Seq(
        "-deprecation",
        "-feature",
        "-unchecked"
    ),
    libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.2.19" % Test,
        "org.scalactic" %% "scalactic" % "3.2.19" % Test,
        "org.scalatestplus" %% "scalacheck-1-18" % "3.2.19.0" % Test,
    ),
)

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

lazy val fp = (project in file("fp"))
  .aggregate(lambdas)
  .settings(
      name := "fp",
      commonSettings
  )

lazy val lambdas = (project in file("fp/lambdas"))
  .settings(
      name := "lambdas",
      commonSettings,
      idePackagePrefix := Some("cl.ravenhill")
  )
