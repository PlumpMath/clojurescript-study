(ns highcharts-reagent-gp.core-test
  (:require [cljs.test :refer-macros [is are deftest testing use-fixtures]]
            [reagent.core :as reagent :refer [atom]]
            [highcharts-reagent-gp.core :as rc]))

(deftest test-home
  (is (= true true)))
