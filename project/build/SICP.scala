import sbt._

class SICP (info :ProjectInfo) extends DefaultProject(info)
{
  val scalatest = "org.scalatest" % "scalatest" % "1.2" % "test"
}
