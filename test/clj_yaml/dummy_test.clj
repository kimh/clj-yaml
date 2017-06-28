(ns clj-yaml.dummy-test
  (:use clojure.test)
  (:use clj-yaml.dummy))

(deftest dummy-works
  (is (dummy-fn)))
