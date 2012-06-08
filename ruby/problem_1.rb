require 'minitest/spec'
require 'minitest/autorun'

class Problem1
  def initialize(multiple_finders)
    @multiple_finders = multiple_finders
  end
  
  def sum_of_multiples_below(upper_bound)
    multiples = @multiple_finders.map{|finder| finder.below(upper_bound)}.flatten.uniq
    multiples.reduce{|memo, number| memo + number}  
  end

end

class FindsMultiples
  def initialize(number_to_find_multiples_for)
    @number_to_find_multiples_for = number_to_find_multiples_for
  end

  def below(upper_bound)
    1.upto(upper_bound-1).select{|number| number % @number_to_find_multiples_for == 0}
  end
end

describe Problem1 do
  it "properly calculates the sum of the multiples of 3 and 5 below 10" do
    problem = Problem1.new([FindsMultiples.new(3),FindsMultiples.new(5)])
    problem.sum_of_multiples_below(10).must_equal 23
  end
  it "properly calculates the sum of the multiples of 3 and 5 below 16" do
    problem = Problem1.new([FindsMultiples.new(3),FindsMultiples.new(5)])
    problem.sum_of_multiples_below(16).must_equal 60
  end
  it "properly calculates the sum of the multiples of 3 and 5 below 1000" do
    problem = Problem1.new([FindsMultiples.new(3),FindsMultiples.new(5)])
    problem.sum_of_multiples_below(1000).must_equal 233168
  end
end

describe FindsMultiples do
  it "finds the multiples of 3 below 10" do
    finder = FindsMultiples.new(3)
    finder.below(10).must_equal [3, 6, 9]
  end

  it "finds the multiples of 5 below 10" do
    finder = FindsMultiples.new(5)
    finder.below(10).must_equal [5]
  end
end
