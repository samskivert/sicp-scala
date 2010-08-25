object Chapter1 {
  def ex11 = List(10, 12, 8, 3, 6, 19, false, 4, 16, 6, 16)

  def ex12 = "(/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))) (* 3 (- 6 2) (- 2 7))))"

  def ex13 (a :Int, b :Int, c :Int) = {
    def sumsq (n :Int, m :Int) = n*n + m*m
    if (a > b) sumsq(a, math.max(b, c)) else sumsq(b, math.max(a, c))
  }

  def ex14 = <p>If b is greater than zero, b is added to a otherwise b is subtracted from a.</p>

  def ex15 = <p>In a normal-order interpreter, the expression will yield the result 0 as the second
    argument to test will not be evaluated prior to invoking test. In an applicative-order
    interpreter the arguments to test will be evaluated before calling test, and in attempting to
    evaluate the second argument, the interpreter will enter an infinite loop. Thus the expression
    will yield no result.</p>

  def ex16 = <p>Because the interpreter is applicative order, it evaluates both arguments to new-if
    prior to yielding a result. Because the second argument to new-if is a recursive call, the
    recursive call will always be evaluated. That recursive call itself makes a recursive call,
    thus we continue ad infinitum and the procedure never returns a value.</p>

  def sqrt17 (x :Float) = {
    def good_enough (guess :Float) = math.abs(guess*guess-x) < 0.001
    def improve (guess :Float) = (guess + x/guess)/2
    def sqrt_iter (guess :Float) :Float =
      if (good_enough(guess)) guess
      else sqrt_iter(improve(guess))
    sqrt_iter(1f)
  }

  def ex17 = <p></p>
}
