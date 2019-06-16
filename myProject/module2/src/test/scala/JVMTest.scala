import mains1.App1
import org.scalatest.{FlatSpec, Matchers}

class JVMTest extends FlatSpec with Matchers {
  "x " should " be 0" in {
    assert (App1.x==0 )
  }
}
