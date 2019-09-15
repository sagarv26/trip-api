name := "TripAPI"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % "2.5.4",
  "org.projectlombok" % "lombok" % "1.16.4",
  "com.google.inject" % "guice" % "4.0"
)     


javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

fork in run := false