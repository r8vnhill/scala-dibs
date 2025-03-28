// =======================================
//  Project Build Definition (build.sbt)
// =======================================

/**
 * This build script defines a multi-module Scala 3 project using SBT. It applies a custom plugin
 * called `CommonSettingsPlugin` that provides shared settings across all subprojects. Each module
 * is set up with consistent naming conventions and optional IDE package prefixes.
 *
 * ## Overview:
 * - Scala version: 3.5.1
 * - Root project: `scala3-dibs`
 * - Modules: `intro`, `testing` (with submodules `pbt`, `biggest`, `generators`, `stats`), `oop` (with `open-final`, `operator-overload`), and `fp`
 *
 * ## Usage:
 * You can run tasks such as:
 * {{{
 * sbt compile
 * sbt test
 * sbt root/compile
 * }}}
 */

// region Imports and Plugins

import CommonSettingsPlugin.commonSettings

ThisBuild / version := "1.0.0"
ThisBuild / scalaVersion := "3.5.1"

enablePlugins(CommonSettingsPlugin)

// endregion

// region Helper Functions

/**
 * Defines a simple subproject with a consistent prefix and shared settings.
 *
 * @param id The SBT project ID.
 * @param path The relative file path to the module.
 * @param prefix Optional IDE package prefix (default: "cl.ravenhill").
 * @return A configured Project instance.
 */
def simpleModule(id: String, path: String, prefix: String = "cl.ravenhill"): Project =
  Project(id, file(path))
    .settings(commonSettings *)
    .settings(
      idePackagePrefix := Some(prefix)
    )

// endregion

// region Root Project

lazy val root = (project in file("."))
  .aggregate(intro)
  .settings(
    name := "scala3-dibs"
  )
  .settings(commonSettings *)

// endregion

// region Intro Module

lazy val intro = project in file("intro")

// endregion

// region Testing Modules

lazy val testing = (project in file("testing"))
  .aggregate(pbt)
  .settings(
    name := "testing"
  )
  .settings(commonSettings *)

lazy val pbt = (project in file("testing/pbt"))
  .aggregate(biggest, generators)
  .settings(
    name := "pbt",
  )
  .settings(commonSettings *)

lazy val biggest = simpleModule(
  id = "biggest",
  path = "testing/pbt/biggest",
)

lazy val generators = (project in file("testing/pbt/generators"))
  .aggregate(stats)
  .settings(
    name := "generators",
  )
  .settings(commonSettings *)

lazy val stats = simpleModule(
  id = "stats",
  path = "testing/pbt/generators/stats",
)

// endregion

// region OOP Modules

lazy val oop = (project in file("oop"))
  .aggregate(openFinal, operatorOverload)
  .settings(
    name := "oop"
  )
  .settings(commonSettings *)

lazy val openFinal = simpleModule(
  id = "open-final",
  path = "oop/open-final",
)

lazy val operatorOverload = simpleModule(
  id = "operator-overload",
  path = "oop/operator-overload",
)

// endregion

// region Functional Programming Module

lazy val fp = project in file("fp")

// endregion
