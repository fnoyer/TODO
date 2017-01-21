name := """Todo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "mysql" % "mysql-connector-java" % "5.1.4",
  "com.typesafe.play" %% "anorm" % "2.5.0",
  "org.webjars" % "bootstrap" % "3.3.2",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

