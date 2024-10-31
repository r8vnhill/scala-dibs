import CommonSettingsPlugin.commonSettings

/**
 * Project configuration for the `fp` module and its submodules `lambdas` and `functors`.
 *
 * This build configuration defines a functional programming module (`fp`) which aggregates two submodules: `lambdas`
 * and `functors`. The `fp` module serves as the main entry point for functional programming-related tasks, while
 * `lambdas` and `functors` provide specific functionalities within the functional programming domain.
 */
lazy val fp = (project in file("."))
  .aggregate(lambdas, functors)
  .settings(
      name := "fp",
      commonSettings
  )

/**
 * The `lambdas` module configuration.
 *
 * The `lambdas` module is part of the functional programming project structure and is used to organize code and tasks
 * related to lambda expressions. It shares `commonSettings` with other modules under `fp` for consistency.
 */
lazy val lambdas = (project in file("lambdas"))
  .settings(
      name := "lambdas",
      commonSettings
  )

/**
 * The `functors` module configuration.
 *
 * The `functors` module is part of the functional programming project structure and organizes code and tasks related to
 * functors. It inherits `commonSettings` for consistency with other modules within `fp`.
 */
lazy val functors = (project in file("functors"))
  .settings(
      name := "functors",
      commonSettings
  )
