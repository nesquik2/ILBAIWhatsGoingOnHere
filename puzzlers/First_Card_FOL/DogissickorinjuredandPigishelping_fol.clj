{:name         "sick-dog-caring-inference"
 :description "FOL reasoning about the care of an injured Dog by a Pig"
 :assumptions {
    ;; propsitioonal calc obsevations (facts from the image)
    A1 (In-Bed D)                          ;; Dog is in bed
    A2 (Wearing-Pajamas D)                 ;; Dog is wearing pajamas (or sick clothes)
    A3 (Serving P Food)                    ;; Pig is serving food
    A4 (Has-Cast D Arm)                    ;; Dog has a cast/sling on its arm (Injury Inference)
    A5 (In-Room Skates)                    ;; Skates are present in the room
    A6 (Picture-of-Skating)                ;; Picture of skating is on the wall

    ;; commonsense axioms (inferences from facts)
    A7 (forall (x) (if (In-Bed x) (Needs-Rest x)))
    A8 (forall (x) (if (Has-Cast x Arm) (Recently-Injured x)))
    A9 (forall (x) (if (and (Recently-Injured x) (In-Room Skates)) 
                        (Caused-By x Ice-Skating)))
    A10 (forall (x) (if (Caused-By x Ice-Skating) (Favorite-Sport x Ice-Skating))) ;; Dog's favorite sport?
    A11 (forall (x y) (if (and (Needs-Rest x) (Serving y Food)) (Showing-Care y x)))
    A12 (forall (x y) (if (Showing-Care x y) (Worthy-of-Gratitude y x)))

    ;; reasoning about gratitude and recovery
    A13 (forall (x y) (if (Worthy-of-Gratitude x y) (Says x y "Thank-You"))) ;; What will the dog say?
    A14 (forall (x y) (if (Showing-Care x y) (Recovered y)))

    ;; emotional inference
    A15 (forall (x) (if (Recently-Injured x) (Feeling x pain)))
    A16 (forall (x y) (if (Showing-Care x y) (Feeling x thoughtful)))
 }
 :goal (and
        ;; trying to answer some of the questions from the back of the card
        (Favorite-Sport D Ice-Skating)  ;; What is the dog's favorite sport?
        (Caused-By D Ice-Skating) ;; What happened to the dog's arm?
        (Says D P "Thank-You") ;; What will the dog say to the pig?
        (Recovered D) ;; The implied outcome of 'What's going on here?')}
        )
} 