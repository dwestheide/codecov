import minitest._

object MathTest extends SimpleTestSuite {
  
  import lib.Math._

  test("-1 is negative") {
    assert(!nonNegative(-1))
  }

}
