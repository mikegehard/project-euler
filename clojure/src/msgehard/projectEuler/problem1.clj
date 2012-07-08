(ns msgehard.projectEuler.problem1)

(defn problem1 [upperBound]
  (let [numbers (range 1 upperBound)
       divisibleBy (fn [divisor num] (= 0 (rem num divisor)))
       divisibleBy3Or5 (fn [num] (or (divisibleBy 3 num ) (divisibleBy 5 num)))
       ]
    (apply + (filter divisibleBy3Or5 numbers))))
