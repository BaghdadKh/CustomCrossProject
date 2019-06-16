package scala.scalanative.testinterface
object TestMain extends TestMainBase {
  override val frameworks = List(new _root_.org.scalatest.tools.Framework)
  override val tests = Map[String, AnyRef]("NativeTest0" -> new _root_.NativeTest0)
  def main(args: Array[String]): Unit =
    testMain(args)
}