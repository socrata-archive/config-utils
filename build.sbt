organization := "com.socrata"

name := "config-utils"

version := "1.0.0"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.0.0",
  "org.scalatest" %% "scalatest" % "1.9.1"
)

scalaVersion := "2.10.1"

crossScalaVersions := Seq("2.9.0", "2.9.0-1", "2.9.1-1", "2.9.2", "2.9.3", "2.10.1")
