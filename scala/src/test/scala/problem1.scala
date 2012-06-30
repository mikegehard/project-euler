import org.specs2.mutable._ 

class Problem1Spec extends Specification {
  "The sum of the multiples of 3 and 5 below 10" should {
    "equal 23" in {
      problem1(10) must beEqualTo(23)
    }
  }
  "The sum of the multiples of 3 and 5 below 16" should {
    "equal 60" in {
      problem1(16) must beEqualTo(60)
    }
  }
  "The sum of the multiples of 3 and 5 below 1000" should {
    "equal 233168" in {
      problem1(1000) must beEqualTo(233168)
    }
  }
}
