ThisBuild / scalaVersion := "3.2.2"
ThisBuild / organization := "com.jarrahtechnology"
ThisBuild / versionScheme := Some("early-semver")
ThisBuild / githubOwner := "jarrahtech"
ThisBuild / githubRepository := "babylonjsfacade"

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin) 
  .settings(
    name := "babylonjsfacade",
    version := "6.2.0",    
    sources in (Compile, doc) := Nil,
    libraryDependencies += "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0",
  )
