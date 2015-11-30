(ns klondike.core)

(defn new-board
  ""
  []
  (let [deck (new-deck)]
    {:piles (for [n (range 1 8)] (take n (take 28 deck)))
     :foundations {:clubs [] :diamonds [] :hearts [] :spades []}
     :deck (drop 28 deck)}))

(defn new-deck
  ""
  []
  (for [suit #{:clubs :diamonds :hearts :spades} value #{"ace" 2 3 4 5 6 7 8 9 10 "jack" "queen" "king"}] {:suit suit :value value}))
