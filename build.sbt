unmanagedSourceDirectories in Compile ++= Seq("src", "example").map(baseDirectory.value / _)

classDirectory in Compile <<= (baseDirectory in Compile)(_ / "bin")

javaOptions in run += "-Djava.library.path=lib"
