name := "CustomProject"

version := "0.1"

scalaVersion := "2.11.8"

lazy val myProject = project.in(file("."))

lazy val myProject0 = project.in(file("./myProject/module1"))
  .settings(scalaVersion := "2.11.8" , libraryDependencies += "org.scalatest" % "scalatest_native0.3_2.11" % "3.2.0-SNAP10")
  .enablePlugins(ScalaNativePlugin)

lazy val myProject01 = project.in(file("./myProject/module2")).settings(scalaVersion := "2.11.8"
  , libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test")


lazy val myProject02 = project.in(file("./myProject/module3")).enablePlugins(ScalaJSPlugin).settings(scalaVersion := "2.12.8",
  scalaJSUseMainModuleInitializer := true
  ,libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.5"
)
