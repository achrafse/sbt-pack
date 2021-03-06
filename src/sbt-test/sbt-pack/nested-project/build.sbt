name := "nested"

version in ThisBuild := "0.1"

scalaVersion in ThisBuild := "2.12.4"

enablePlugins(PackPlugin)

lazy val root = (project in file("."))
        .dependsOn(module1, module2)

lazy val module1 = (project in file("modules/module1")).dependsOn(lib1)
lazy val module2 = (project in file("modules/module2")).dependsOn(lib2)

lazy val lib1 = project in file("libs/lib1")
lazy val lib2 = project in file("libs/lib2")
