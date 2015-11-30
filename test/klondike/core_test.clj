(ns klondike.core-test
  (:require [clojure.test :refer :all]
            [klondike.core :refer :all]))

(deftest a-new-board
  (testing "the structure of a blank board"
    #_(is (= (new-board)
           {:piles [[] [] [] [] [] [] []]
            :foundations {:clubs [] :diamonds [] :hearts [] :spades []}
            :deck []}))
    (is (= (keys (new-board)) [:piles :foundations :deck]))
    (is (= true
           (every? empty? (vals (:foundations (new-board))))))
    (is (= (count (:piles (new-board))) 7))
    (is (= (range 1 8)
           (map count (:piles (new-board)))))))

(deftest test-new-deck
  (testing "a new deck of 52 cards"
    (is (= (count (new-deck)) 52))))
