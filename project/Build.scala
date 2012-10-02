import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "mailerApp"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.typesafe" %% "play-plugins-mailer" % "2.0.4"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
