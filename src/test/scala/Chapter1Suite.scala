import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class Chapter1Spec extends FlatSpec with ShouldMatchers {
  import Chapter1._

  "ex11" should "return the appropriate list of values" in {
    val a = 3
    val b = a+1
    ex11 should equal(List(
      10,
      5 + 3 + 4,
      9 - 1,
      6 / 2,
      (2 * 4) + (4 - 6),
      a + b + (a * b),
      a == b,
      if ((b > a) && (b < (a * b))) b else a,
      if (a == 4) 6 else if (b == 4) 6 + 7 + a else 25,
      2 + (if (b > a) b else a),
      (if (a > b) a else if (a < b) b else -1) * (a + 1)))
  }

  "ex12" should "return the appropriate string" in {
    ex12 should equal("(/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))) (* 3 (- 6 2) (- 2 7))))")
  }

  "ex13" should "return the sum of the squares of the largest two of its args" in {
    ex13(1, 2, 3) should equal(13)
    ex13(3, 2, 1) should equal(13)
    ex13(3, 1, 2) should equal(13)
  }

  // ex14 requires a human evaluator

  
}
