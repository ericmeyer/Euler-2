(ns basics-spec
  (:use [speclj.core]
        [euler2.core])
  (:require [euler2.core]))

(describe "Euler 2 - sum even numbers of the fibonacci sequence up to a max"

  (it "sums up to 1" ;; 1
    (should= 0 (euler2 1)))
  
  (it "sums up to 2" ;; 1 2
    (should= 2 (euler2 2)))

  (it "sums up to 3" ;; 1 2 3
    (should= 2 (euler2 3)))
  
  (it "sums up to 5" ;; 1 2 3 5
    (should= 2 (euler2 5)))

  (it "sums up to 8" ;; 1 2 3 5 8
    (should= 10 (euler2 8)))

  (it "sums up to 8" ;; 1 2 3 5 8
    (should= 4613732 (euler2 4000000)))
        
)

(describe "fib-seq"
  (it "gets up to 1"
    (should= [1] (fib-seq-up-to 1)))

  (it "gets up to 2"
    (should= [1 2] (fib-seq-up-to 2)))

  (it "gets up to 3"
    (should= [1 2 3] (fib-seq-up-to 3)))

  (it "gets up to 5"
    (should= [1 2 3 5] (fib-seq-up-to 5)))
)

(run-specs)