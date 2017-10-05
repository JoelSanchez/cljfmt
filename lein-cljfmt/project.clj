(defproject lein-cljfmt "0.5.7"
  :description "A library for formatting Clojure code"
  :url "https://github.com/weavejester/cljfmt"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[cljfmt "0.5.7"]
                 [meta-merge "1.0.0"]
                 [org.clojure/core.async "0.3.443"]
                 [com.googlecode.java-diff-utils/diffutils "1.2.1"]])
