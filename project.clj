(defproject scrape "0.1.0-SNAPSHOT"
  :description "BitScrape:- Pool scraper for displaying best mining rates."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring-core "1.7.0-RC1"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-jetty-adpater "1.7.0-RC1"]
                 [compojure "1.6.1"]
                 [enlive "1.1.6"]]
  :main ^:skip-aot scrape.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
