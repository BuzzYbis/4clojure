; Hello world

(= ((fn [s] (format "Hello, %s!" s)) "Dave") "Hello, Dave!")
(= (#(format "Hello, %s!" %) "Jenn") "Hello, Jenn!")
(= ((fn greet [s] (format "Hello, %s!" s) "Rhea") "Hello, Rhea!")
