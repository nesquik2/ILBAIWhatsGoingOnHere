{:name        "social-scene-c-inference"
 :description "FOL reasoning about a social scene involving Dog, Pig, and Fox"
 :assumptions {
   ;; propositional calc observations
   A1  (Smiling A) 
   A2  (Smiling B)
   A3  (Laughing A)
   A4  (Laughing B)
   A5  (lookingAt A B)
   A6  (lookingAt B A)
   A7  (talkingWith A B)
   A8  (sittingTogether A B)
   A9  (not (sittingTogether C A))
   A10 (not (sittingTogether C B))
   A11 (not (Smiling C)) 
   A12 (not (Laughing C))
   A13 (lookingAt C A) 
   A14 (lookingAt C B)

   ;; commonsense axioms
   A15 (forall (x y) (if (and (talkingWith x y) (Smiling x) (Smiling y))(friendlyInteraction x y)))
   A16 (forall (x y) (if (sittingTogether x y) (closeProximity x y)))
   A17 (forall (x y) (if (and (friendlyInteraction x y) (closeProximity x y))(includedWithEachOther x y)))

   ;; reasoning about exclusion
   A18 (forall (x y z) (if (and (includedWithEachOther x y) (not (sittingTogether z x)) 
                (not (sittingTogether z y)) (lookingAt z x) (lookingAt z y)
                (not (Smiling z)) (not (Laughing z)))
            (mightFeelExcluded z)))
   A19 (forall (z) (if (mightFeelExcluded z) (wantsToJoin z)))

   ;; emotional inference from exclusion 
   A20 (forall (z) (if (mightFeelExcluded z) (Feeling z sad)))

   ;; possible exclusionary behavior definition
   A21 (forall (x y z) (if (and (includedWithEachOther x y) (lookingAt z x) (lookingAt z y)
            (mightFeelExcluded z)) (possiblyBeingMean x y z)))
 }

 :goal (and
        ;;trying to answer some of the questions from the back of the card
         (wantsToJoin C)          ;; what does the fox want?
         (Feeling C sad)          ;; how is the fox feeling?
         (possiblyBeingMean A B C) ;; are the dog and pig being mean?
       )
}
