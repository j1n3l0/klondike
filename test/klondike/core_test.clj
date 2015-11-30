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

(deftest last-card-in-each-pile-upturned
  (testing "the last card in each pile should be upturned"
    (is (= true (every? :upturned? (map last (:piles (new-board))))))))

#_(deftest all-but-the-last-card-is-not-upturned
  (testing "all but the last card in each pile is not upturned"
    (is (apply = false ()))))

(deftest test-new-deck
  (testing "a new deck should contain 52 cards"
    (is (= (count (new-deck)) 52))))
