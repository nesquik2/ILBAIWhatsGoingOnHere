{:assumptions
 {1 p                       ;; p: Cat1's team won the soccer game
  2 q                       ;; q: Cat2's team lost the soccer game
  3 (if q j)                ;; if Cat2's team lost, Cat2 is jealous
  4 (if p c)                ;; if Cat1's team won, the parent celebrates with Cat1
  5 (if c n)}               ;; if the parent celebrates with Cat1, the parent doesn't notice Cat2's jealousy

 :goal
 (and q j n)}               ;; Cat2's team lost, Cat2 is jealous, and the parent doesn't notice it