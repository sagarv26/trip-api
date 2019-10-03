name := "tripapi"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  cache,
  javaEbean,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % "2.5.4",
  "org.projectlombok" % "lombok" % "1.16.4",
  "com.google.inject" % "guice" % "4.0",
  "redis.clients" % "jedis" % "2.9.0",
  "org.apache.logging.log4j" % "log4j-api" % "2.7",
  "org.apache.logging.log4j" % "log4j-core" % "2.7",
  "org.elasticsearch" % "elasticsearch" % "5.6.3",
  "org.elasticsearch.client" % "transport" % "5.6.3",
  "commons-lang" % "commons-lang" % "2.3",
  "commons-collections" % "commons-collections" % "3.2.1",
  "commons-io" % "commons-io" % "2.4",
  "commons-codec" % "commons-codec" % "1.6"
)

ebeanEnabled := true  

libraryDependencies += "io.netty" % "netty" % "3.6.3.Final" force()

play.Project.playJavaSettings
