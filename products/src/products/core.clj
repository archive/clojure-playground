(ns products.core
  (:require [clojure.data.json :as json]))

(defn -main [& args]

  (defn nameAndPrice [m]
    (select-keys m [:name :price]))

  (let [data (json/read-str (slurp "products.json") :key-fn keyword)]
    (let [products (get data :products)]
      (let [sortedProducts (sort-by :price products)]
        (println (map nameAndPrice sortedProducts))))))


(comment "
(defn foo [m f]
  (into {} (for [[k v] m] [k (f v)])))
")