ThisBuild / scalaVersion := "3.2.2"
ThisBuild / organization := "com.jarrahtechnology"
ThisBuild / versionScheme := Some("early-semver")
ThisBuild / githubOwner := "jarrahtech"
ThisBuild / githubRepository := "babylonjsfacade"

val babylonjsVersion = "6.14.1"

lazy val root = project.in(file("."))
  .enablePlugins(ScalablyTypedConverterGenSourcePlugin) 
  .settings(
    name := "babylonjsfacade",
    version := babylonjsVersion,    

    Compile / npmDependencies ++= Seq(
      "babylonjs" -> babylonjsVersion,
      "babylonjs-gui" -> babylonjsVersion
    ),
    stMinimize := Selection.AllExcept("babylonjs",  "babylonjs-gui"),
    Global / stQuiet := true,
    Compile / doc / sources := Nil,
    stOutputPackage := "facade",
  )
