; Penultimate Element

(defn penultimate [list] (second (reverse list)))

(= (penultimate (list 1 2 3 4 5)) 4)
(= (penultimate ["a" "b" "c"]) "b")
(= (penultimate [[1 2] [3 4]]) [1 2])
