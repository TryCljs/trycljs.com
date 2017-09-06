(ns trycljs.views.home)

(defn header []
  [:div {:id "header"}
   [:img {:src "img/clojurescript.png"}]
   [:h1 {:class "title"}
    [:span {:class "logo-try"} [:span {:class "try"} "Try "] [:span {:class "clojurescript"} "Clojurescript"]]]])

(defn banner []
  [:section {:id "banner"}
   [:div {:class "inner split"}
    [:section
     [:h2 "A clojurescript jumping off point"]]
    [:section
     [:p "Lorem ipsum nisl sed cursus magna et amet veroeros. Phasellus aliquam et tempus lorem dolor feugiat adipiscing lorem."]
     [:ul {:class "actions"}
      [:li
       [:a {:href "#", :class "button special"} "Get started"]]]]]])

(defn one []
  [:section {:id "one", :class "wrapper"}
   [:div {:class "inner split"}
    [:section
     [:h2 "Why clojurescript?"]
     [:p ""]]
    [:section
     [:ul {:class "checklist"}
      [:li "Functional language features by default"]
      [:li "Immutability by default"]
      [:li "Data first"]
      [:li "Concise"]]]]])

(defn spotlight [spotlight-info]
  (let [{:keys [spotlight-img spotlight-title spotlight-body spotlight-link]} spotlight-info]
    [:div {:class "spotlight"}
     [:div {:class "image"}
      [:img {:src spotlight-img, :alt spotlight-title}]]
     [:div {:class "content"}
      [:h3 spotlight-title]
      [:p spotlight-body]
      [:ul {:class "actions"}
       [:li
        [:a {:href spotlight-link, :class "button alt" :target "_blank"} "Details"]]]]]))

(defn two []
  [:section {:id "two", :class "wrapper style2 alt"}
   [:div {:class "inner"}

    (spotlight {:spotlight-img "img/pic01.png"
                :spotlight-title "Try a web repl"
                :spotlight-body "Try a clojurescript web repl in your browser"
                :spotlight-link "http://clojurescript.net/"})

    (spotlight {:spotlight-img "img/pic02.jpg"
                :spotlight-title "Lorem ipsum"
                :spotlight-body "Lorem ipsum nisl sed cursus magna et amet veroeros. Sed phasellus malesuada quis orci. Pellentesque eget consequat."
                :spotlight-link "#"})

    (spotlight {:spotlight-img "img/pic03.jpg"
                :spotlight-title "Lorem ipsum"
                :spotlight-body "Lorem ipsum nisl sed cursus magna et amet veroeros. Sed phasellus malesuada quis orci. Pellentesque eget consequat."
                :spotlight-link "#"})]])

(defn contact []
  [:section {:id "contact", :class "wrapper"}
   [:div {:class "inner split"}
    [:section
     [:h2 "Orci malesuada"]
     [:p "Morbi pharetra vitae felis placerat pharetra. Nulla risus orci, dapibus id malesuada et nec, malesuada quis pellentesque eget."]
     [:form {:action "#", :class "alt", :method "POST"}
      [:div {:class "row uniform"}
       [:div {:class "6u 12u$(xsmall)"}
        [:input {:name "name", :placeholder "Name", :type "text"}]]
       [:div {:class "6u$ 12u$(xsmall)"}
        [:input {:name "email", :placeholder "Email", :type "email"}]]
       [:div {:class "12u$"}
        [:textarea {:name "message", :placeholder "Message", :rows "4"}]]]
      [:ul {:class "actions"}
       [:li
        [:input {:class "alt", :value "Send message", :type "submit"}]]]]]
    [:section
     [:ul {:class "contact"}
      [:li {:class "fa-twitter"}
       [:a {:href "#"} "twitter.com/untitled-tld"]]
      [:li {:class "fa-facebook"}
       [:a {:href "#"} "facebook.com/untitled-tld"]]
      [:li {:class "fa-instagram"}
       [:a {:href "#"} "instagram.com/untitled-tld"]]
      [:li {:class "fa-envelope"}
       [:a {:href "#"} "information@untitled.tld"]]
      [:li {:class "fa-home"} "1234 Somewhere Road Suite 9823"
       [:br]"Nashville, TN 00000-0000"]]]]])

(defn footer []
  [:footer {:id "footer"}
   [:div {:class "copyright"} "© Untitled. All rights reserved. Images: "
    [:a {:href "http://unsplash.com"} "Unsplash"]". Design: "
    [:a {:href "http://templated.co"} "TEMPLATED"]]])

(defn html []
  [:div.home
   (header)
   (banner)
   (one)
   (two)
   (contact)
   (footer)])
