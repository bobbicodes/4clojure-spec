(ns specs
  (:require [clojure.spec.alpha :as s]))

(s/def ::problem-001 true?)
(s/def ::problem-002 #(= 4 %))
(s/def ::problem-003 #(= "HELLO WORLD" %))
(s/def ::problem-004 #(= '(:a :b :c) %))

;; Am I doing this right? Feels like I might be missing something.
;; I expect this will get more interesting as we go on.

(comment
  (s/valid? ::problem-001 false)
  )
