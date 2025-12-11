{
 :logic :fol

 :assumptions
 {
   ;; Basic facts
   A1  (Fighting Kid1 Kid2)
   A2  (Valuable Truck1)
   A3  (Watching AdultFox Kid1)
   A4  (Watching AdultFox Kid2)
   A5  (WantsSharing AdultFox)
   A6  (Wants Kid1 Truck1)
   A7  (Wants Kid2 Truck1)

   ;; Fighting → wanting the same toy
   A8  (forall (x y)
         (implies (Fighting x y)
                  (exists (t)
                    (and (Wants x t)
                         (Wants y t)))))

   ;; Wanting same toy + valuable toy → conflict
   A9  (forall (x y t)
         (implies (and (Wants x t)
                       (Wants y t)
                       (Valuable t))
                  (Conflict x y)))

   ;; Any conflict → Q1
   A10 (forall (x y)
         (implies (Conflict x y)
                  Q1))

   ;; Both kids want the truck → Q2
   A11 (implies (and (Wants Kid1 Truck1)
                     (Wants Kid2 Truck1))
                Q2)

   ;; Adult fox watching both kids → Q3
   A12 (implies (and (Watching AdultFox Kid1)
                     (Watching AdultFox Kid2))
                Q3)

   ;; Conflict + adult watching + adult wants sharing → Q4
   A13 (forall (x y)
         (implies (and (Conflict x y)
                       (Watching AdultFox x)
                       (Watching AdultFox y)
                       (WantsSharing AdultFox))
                  Q4))
 }

 :goal
 (and Q1 Q2 Q3 Q4)
}
