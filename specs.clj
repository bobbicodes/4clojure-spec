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
(s/def ::problem-009 #(= #{1 4 3 2} %))
(s/def ::problem-010 #(= 20 %))
(s/def ::problem-011 #(= [:b 2] %))
(s/def ::problem-012 #(= 3 %))
(s/def ::problem-013 #(= [20 30 40] %))

;; Am I doing this right? Feels like I might be missing something.

;; Yes, I may be beginning to understand.
;; This is all completely wrong!
;; We need to actually step outside of these examples
;; and get to the heart of each problem.
;; Ask this: how would you generate a random example test?
;; This could be potentially useful - you could show the user a new,
;; spec-generated version of the problem every time.

;; I can't decide whether #1 is impossible to spec or trivially easy,
;; because it can be any truthy value.

;; To do #2 right (capitalizing "hello world"), I don't want to just
;; show the user a random string.
;; I want it to be 2 actual simple English words. 
;; Fortunately, I already have a list of those from another project...

(comment
  (s/valid? ::problem-001 false)
  )
