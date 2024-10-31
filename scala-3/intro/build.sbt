import CommonSettingsPlugin.commonSettings

/**
 * Project configuration for the `intro` and `exceptions` submodules.
 *
 * This build configuration defines two modules: `intro` and `exceptions`. The `intro` module aggregates the
 * `exceptions` module, meaning that tasks run on `intro` will also execute in `exceptions`. Each module has its own
 * `name` and shares `commonSettings`.
 */
lazy val intro = (project in file("."))
  .aggregate(exceptions)
  .settings(
      name := "intro",
      commonSettings
  )

/**
 * The `exceptions` module configuration.
 *
 * This module is configured with its own name, "exceptions", and shares the `commonSettings` with the `intro` module.
 * This configuration allows `exceptions` to run its own tasks independently, or as part of aggregated tasks initiated
 * from `intro`.
 */
lazy val exceptions = (project in file("exceptions"))
  .settings(
      name := "exceptions",
      commonSettings,
  )
