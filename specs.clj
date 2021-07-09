(ns specs
  (:require [clojure.spec.alpha :as s]))

(s/def ::problem-001 true?)

(comment
  (s/valid? ::problem-001 false)
  )
