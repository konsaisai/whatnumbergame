(ns sample-project.fizzbuzz)
(defn type-a [number]
  (dotimes [n number] 
    (let [ int-number (inc n)]
      (cond (= (mod int-number 15) 0) (println "fizzbuzz") 
        (= (mod int-number 3) 0)  (println "fizz") 
          (= (mod int-number 5) 0)  (println "buzz") 
            :else (println int-number)))))
            
(defn fizzbuzz [number]
    (cond (= (mod number 15) 0) "fizzbuzz"
          (= (mod number 3) 0)  "fizz"
          (= (mod number 5) 0)  "buzz"
          :else number))

(defn type-b [number]
  (doseq [numnum (map fizzbuzz (range 1 (inc number)))]
    (println numnum)))
                      
(defn -main [number]
  (type-a (Long/parseLong number))
  (println "")
  (println "↓B")
  (type-b (Long/parseLong number))
  )
                        