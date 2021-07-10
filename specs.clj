(ns specs
  (:require [clojure.spec.alpha :as s]))

(s/def ::problem-001 true?)
(s/def ::problem-002 #(= 4 %))
(s/def ::problem-003 #(= "HELLO WORLD" %))
(s/def ::problem-004 #(= '(:a :b :c) %))
(s/def ::problem-005 #(= '(1 2 3 4) %))
(s/def ::problem-006 #(= '(:a :b :c) %))
(s/def ::problem-007 #(= '[1 2 3 4] %))
(s/def ::problem-008 #(= #{:c :b :d :a} %))

;; Am I doing this right? Feels like I might be missing something.
;; I could be making finer-grained specs and composing them,
;; but would that not be pointless, considering that #3 need not just be
;; a *string* and *capitalized*, it needs to satisfy `#(= "HELLO WORLD" %)`.
;; I expect this to get more interesting as we go on.

(comment
  (s/valid? ::problem-001 false)
  )
