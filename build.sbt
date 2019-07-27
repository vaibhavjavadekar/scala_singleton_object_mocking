name := "scala_singleton_object_mocking"
  
version := "1.0"
  
scalaVersion := "2.11.8"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies += "org.powermock" % "powermock-module-junit4-rule" % "1.5.1"

libraryDependencies += "org.powermock" % "powermock-api-mockito" % "1.5.1"

libraryDependencies += "org.powermock" % "powermock-classloading-xstream" % "1.5.1"

libraryDependencies += "org.mockito" % "mockito-all" % "1.9.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0"

libraryDependencies += "junit" % "junit" % "4.11" % "test"