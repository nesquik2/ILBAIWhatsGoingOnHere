{
 :assumptions {
                1 (StuckHigh puppy)
                2 (forall (x) ;; if s, then f: If stuck, puppy is frightened
                    (if (StuckHigh x) (Frightened x)))
                3 (forall (x) ;; if f, then c: If frightened, puppy is crying
                    (if (Frightened x) (IsCrying x)))
                4 (CanHelp pig puppy) ;; h: pig is capable of helping the puppy
                5 (forall (y z) ;; if h, then a: If pig can help, pig takes action (to rescue)
                    (if (CanHelp y z)
                        (exists (action) (TakesAction y z action))))
                6 (forall (y z action) ;; if a, then r: If action is taken, puppy is rescued
                    (if (TakesAction y z action)
                        (IsRescued z)))
                }
 :goal          (exists (action) ;; Goal: c AND a AND r
                  (and (IsCrying puppy)
                       (TakesAction pig puppy action)
                       (IsRescued puppy)))}