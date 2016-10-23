(ns cljs-compile-bug.core)

(defn f [{:keys [a] :or {a #js {}}}])
