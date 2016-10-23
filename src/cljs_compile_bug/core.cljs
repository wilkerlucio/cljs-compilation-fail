(ns cljs-compile-bug.core)

(defn lazily-loaded
  [{:keys [a] :or {a #js {}}}])
