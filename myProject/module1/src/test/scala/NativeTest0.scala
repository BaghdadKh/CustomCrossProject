import org.scalatest.{FlatSpec, Matchers}

class NativeTest0 extends FlatSpec with Matchers {

  "s " should " be 0  " in {
    assert (mains0.App0.s==0 )
  }
}
