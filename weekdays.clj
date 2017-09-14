(let [names ["mon" "tue" "wed" "thu" "fri" "sat" "sun"]]
  (let [randomIndex (rand-int 6)]
    (let [dayName (get names randomIndex)]
        (println dayName)
     )))
