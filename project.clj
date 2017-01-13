(defproject clojure-spels "0.1.0-SNAPSHOT"
  :description "Learning how to write an adventure game in clojure"
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clojure-spels.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
