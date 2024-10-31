import sbt.{AutoPlugin, Def, Task, Test}
import sbt.Keys.{libraryDependencies, scalacOptions}
import sbt.librarymanagement.ModuleID
import sbtide.Keys.idePackagePrefix

object CommonSettingsPlugin extends AutoPlugin {
    lazy val commonSettings: Seq[Def.Setting[? >: Task[Seq[String]] & Seq[ModuleID] & Option[String] <: Equals]] = Seq(
        scalacOptions ++= Seq(
            "-deprecation",
            "-feature",
            "-unchecked"
        ),
        libraryDependencies ++= Seq(
            Dependencies.scalaTest % Test,
            Dependencies.scalactic % Test,
            Dependencies.scalaCheck % Test
        ),
        idePackagePrefix := Some("cl.ravenhill")
    )
}
