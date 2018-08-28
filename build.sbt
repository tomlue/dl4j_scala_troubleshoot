name := "simplecuda"
version := "1.0"
scalaVersion := "2.11.8"


// looks like you need to remove ~/.ivy2/cache and ~/.javacpp/cache whenever you switch between platforms 
classpathTypes += "maven-plugin"
libraryDependencies ++= Seq(
	"org.scalactic" %% "scalactic" % "3.0.5",
	"org.scalatest" %% "scalatest" % "3.0.5" % "test",
	
	// "org.nd4j" % "nd4j-cuda-9.2-platform" % "1.0.0-beta2",	
	// "org.deeplearning4j" % "deeplearning4j-cuda-9.2" % "1.0.0-beta2"

	"org.nd4j" % "nd4j-native-platform" % "1.0.0-beta2",
	"org.deeplearning4j" % "deeplearning4j-core" % "1.0.0-beta2",
	"org.bytedeco.javacpp-presets" % "openblas" % "0.2.20-1.3" classifier "linux-x86_64"
)

assemblyMergeStrategy in assembly := {
	case PathList("META-INF", xs @ _*) => MergeStrategy.discard
	case x => MergeStrategy.first
}	