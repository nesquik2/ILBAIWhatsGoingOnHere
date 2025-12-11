{
 :logic :fol

 :assumptions
 {
   ;; Basic facts
   A1  (Hug Dog1 Cat1)
   A2  (Friendly Dog1)
   A3  (Surprised Cat1)
   A4  (not (Expected Cat1 (Hug Dog1 Cat1)))
   A5  (Watching Dog2)

   ;; Surprised → unexpected action
   A6  (forall (c)
         (implies (Surprised c)
                  (UnexpectedAction c)))

   ;; Friendly → positive intent
   A7  (forall (d)
         (implies (Friendly d)
                  (PositiveIntent d)))

   ;; Watching → Q1
   A8  (forall (d)
         (implies (Watching d)
                  Q1))

   ;; Friendly + unexpected → Q2
   A9  (forall (d c)
         (implies (and (Friendly d)
                       (Hug d c)
                       (UnexpectedAction c))
                  Q2))

   ;; Did not expect → Q3
   A10 (forall (c d)
         (implies (and (Hug d c)
                       (not (Expected c (Hug d c))))
                  Q3))

   ;; All conditions → Q4
   A11 (forall (d c)
         (implies (and (Friendly d)
                       (Hug d c)
                       (UnexpectedAction c)
                       (Watching Dog2))
                  Q4))
 }

 :goal
 (and Q1 Q2 Q3 Q4)
}
