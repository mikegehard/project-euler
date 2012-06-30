import org.specs2.mutable._ 

class Problem1Spec extends Specification {
  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
  }
}
