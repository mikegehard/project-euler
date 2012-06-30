object problem1{
  def apply(upperBound: Int) : Int = {
    Range(1, upperBound).filter((num:Int) => multipleOf(5)(num) || multipleOf(3)(num)).sum
  } 
}

object multipleOf{
  def apply(divisor: Int)(num: Int): Boolean = num % divisor == 0
}

