(ns klondike.core-test
  (:require [clojure.test :refer :all]
            [klondike.core :refer :all]))

(deftest a-new-board
  (testing "the structure of a blank board"
    (is (= (new-board)
           {:piles []
            :foundations {:clubs [] :diamonds [] :hearts [] :spades []}
            :deck []}))
    (is (= true
           (every? empty? (vals (:foundations (new-board))))))))

(deftest test-new-deck
  (testing "a new deck of 52 cards"
    (is (= (count (new-deck)) 52))))
