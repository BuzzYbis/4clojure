; Sets

(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :c :d :b} (clojure.set/union #{:a :b :c} #{:b :c :d}))
