(ns euler2.core)

(defn second-to-last [list]
  (last (pop list)))
  
(defn fib [list max]
  (if (> (+ (last list) (second-to-last list)) max)
    list
    (recur (vec (concat list [(+ (last list) (second-to-last list))])) max)))

(defn fib-seq-up-to [max]
  (if (= max 1)
    [1]
    (if (= max 2)
      [1 2]
      (fib [1 2] max))))

(defn euler2 [max]
  (reduce + (filter even? (fib-seq-up-to max))))
