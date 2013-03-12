import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "myPlayApp"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "mysql" % "mysql-connector-java" % "5.1.18" // THIS is for local and Heroku with ClearDB
      // "postgresql" % "postgresql" % "8.4-702.jdbc4" // THIS is for Heroku until I find how to set up MySQL
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
