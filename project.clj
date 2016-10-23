(defproject cljs-compile-bug "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha13" :scope "provided"]
                 [org.clojure/clojurescript "1.9.293" :scope "provided"]
                 [com.cognitect/transit-clj "0.8.290"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["resources/public/site" "target"]

  :plugins [[lein-cljsbuild "1.1.4"]]

  :cljsbuild {:builds
              [{:id           "site"
                :source-paths ["src"]
                :compiler     {:main                 cljs-compile-bug.core
                               :source-map-timestamp true
                               :asset-path           "/site"
                               :output-to            "resources/public/site/site.js"
                               :output-dir           "resources/public/site"
                               :parallel-build       true
                               :recompile-dependents true
                               :verbose              false}}]})
