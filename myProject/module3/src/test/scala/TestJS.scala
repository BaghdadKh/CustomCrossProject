import org.scalatest.{FlatSpec, Matchers}

class TestJS extends FlatSpec with Matchers{
"s " should " be 0 " in {
    assert(MainJS.s ==0)
  }
}
