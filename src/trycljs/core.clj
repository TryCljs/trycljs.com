(ns trycljs.core
  (:require [compojure.handler :as h]
            [compojure.route :as r]
            [compojure.core :as c]

            [hiccup.middleware :as m]
            [hiccup.page :as p]

            [trycljs.views.home :as home]))

(defn layout [& body]
  (p/html5
   [:head
    [:title "Try Clojurescript"]
    [:link {:type "image/x-icon", :href "img/favicon.ico", :rel "icon"}]
    (p/include-css "/css/site.css")]
   [:body body]))

(c/defroutes app-routes
  (c/GET "/" [] (layout (home/html)))
  (r/resources "/")
  (r/not-found "Not Found"))

(def app
  (-> (c/routes app-routes)
      (h/site)
      (m/wrap-base-url)))
