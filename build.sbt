import sbt.Keys.{libraryDependencies, scalaVersion, version}

//lazy val root = (Project("root", file(".")))
//  .settings(
//    name := "cse598asg8",
//    version := "0.1",
//    organization  := "com.cse598",
//    scalaVersion := "2.11.11",
//    publishMavenStyle := true,
//    mainClass := Some("cse598.task2")
//  )
//libraryDependencies ++= Seq(
//  "org.apache.spark" %% "spark-core" % "2.1.0" % "compile",
//  "org.apache.spark" %% "spark-mllib" % "2.1.0" % "compile",
//  "com.github.fommil.netlib" % "all" % "1.1.2" % "compile",
//  "org.scalanlp" %% "breeze" % "0.11.2" % "compile",
//  "org.scalanlp" %% "breeze-natives" % "0.12" % "compile"
//)

lazy val root = (Project("root", file(".")))
  .settings(
    name := "cse598asg8",
    version := "0.1",
    organization  := "com.cse598",
    scalaVersion := "2.11.6",
    publishMavenStyle := true,
    mainClass := Some("cse598.task2")
  )
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.2.0" % "compile",
  "org.apache.spark" %% "spark-mllib" % "2.1.0" % "compile",
  "com.github.fommil.netlib" % "all" % "1.1.2" % "compile",
  "org.scalanlp" %% "breeze" % "0.13.2" % "compile",
  "org.scalanlp" %% "breeze-natives" % "0.12" % "compile"
)


//scala >= 2.11.6
//breeze_2.11 >= 0.13.2
//breeze-natives_2.11 >= 0.12
//spark-core_2.11 >= 2.2.0
//spark-mllib_2.11 >= 2.1.0