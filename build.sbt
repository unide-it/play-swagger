name := """play-java-hello-world-tutorial"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, SwaggerPlugin)

swaggerDomainNameSpaces := Seq("models")

scalaVersion := "2.13.6"

libraryDependencies += guice

libraryDependencies ++= Seq(

  "org.webjars" % "swagger-ui" % "4.5.0"  //play-swagger ui integration
)
