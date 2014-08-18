import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

name := "akka-simpleton"

version := "1.0"

mainClass in Compile := Some("akka.Main")

packageArchetype.java_application

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.5"

bashScriptExtraDefines += "app_commands=info.rkuhn.Simpleton"


