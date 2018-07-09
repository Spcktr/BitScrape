(ns scrape.core
  (:require [net.cgrand.enlive-html :as html]
        [compojure.core :as compojure]
        [ring.adpater.jetty :as jetty]
        [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))


(defn get-dom
  []
  (html/html-snippet
    (:body @(compojure/GET "http://nanopool.org"))))

(defn extract-coin-name
  [dom]
  (map
    (comp first :coin-name)
      (html/select dom [:a.panel-title])))

(defn -main
  []
  (let [coin-name (extract-coin-name (get-dome))]
    print coin-name))
