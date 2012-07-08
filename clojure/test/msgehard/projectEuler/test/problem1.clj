(ns msgehard.projectEuler.test.problem1
  (:use [msgehard.projectEuler.problem1])
  (:use [clojure.test]))

(deftest sum_below_ten
  (is (= (problem1 10) 23)))

(deftest sum_below_16
  (is (= (problem1 16) 60)))
