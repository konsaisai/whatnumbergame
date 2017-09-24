(ns sample-project.whatnumber)            
(defn numberbingo []
    ;乱数作成
    (let [randnum (rand-int 20)]
    ;読込
      (loop [readnum (Long/parseLong(read-line)), times 1]  
        (println (str times "回目！！"))
        (cond (= times 5)
              (println "残念！！")
              (= randnum readnum)
              (println "大正解！！")
              :else
              (do 
                (when (< randnum readnum)
                  (println "数字が大きいよ。"))
                (when (> randnum readnum)
                  (println "数字が小さいよ。"))
                (recur (Long/parseLong(read-line)) (+ times 1)))))))


                      
(defn -main []
  (println "数字を当ててください。0から20までです。")
  (println "チャンスは5回。")
  (numberbingo)
  )
                        