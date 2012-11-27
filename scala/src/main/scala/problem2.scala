  /**
 * Created with IntelliJ IDEA.
 * User: msgehard
 * Date: 11/26/12
 * Time: 10:00 PM
 * To change this template use File | Settings | File Templates.
 */
object problem2 {
  def apply() {
    problem2.lazyFib filter {_ % 2 == 0} takeWhile {_ <= 4000000} sum
  }

  def lazyFib: Stream[Long] = {
    def fibInner(f0: Long, f1: Long): Stream[Long] = {
      Stream.cons(f0, fibInner(f1, f1 + f0))
    }
    fibInner(1,2)
  }
}
