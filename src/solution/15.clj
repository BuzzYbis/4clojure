; Double down

(= ((fn [x] (* 2 x)) 2) 4)
(= (#(* 2 %) 3) 6)
(= ((fn double [x] (* 2 x)) 11) 22)
(= ((partial * 2) 7) 14)
