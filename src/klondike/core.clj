(ns klondike.core)

(defn new-board
  ""
  []
  {:piles []
   :foundations {:clubs [] :diamonds [] :hearts [] :spades []}
   :deck []})

(defn new-deck
  ""
  []
  (for [suit #{:clubs :diamonds :hearts :spades} value #{"ace" 2 3 4 5 6 7 8 9 10 "jack" "queen" "king"}] {:suit suit :value value}))
