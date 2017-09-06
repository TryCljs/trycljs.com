(defproject trycljs "0.1.0-SNAPSHOT"

  :description "TryCljs"

  :url "https://trycljs.com/"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.2"]
                 [hiccup "1.0.5"]
                 [ring-server "0.4.0"]]

  :plugins [[lein-ring "0.8.12"]]

  :ring {:handler trycljs.core/app}

  :profiles {:uberjar {:aot :all}
             :production {:ring {:open-browser? false
                                 :stacktraces? false
                                 :auto-reload? false}}
             :dev {:dependencies [[ring-mock "0.1.5"]
                                  [ring/ring-devel "1.5.1"]]}})
