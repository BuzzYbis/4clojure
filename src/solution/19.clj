; Last Element

(defn last_elt [[head & list]]
    (if list
        (recur list)
        head))

(= (last_elt ["b" "c" "d"]) "d")
(= (last_elt '(5 4 3)) 3)
(= (last_elt [1 2 3 4 5]) 5)
