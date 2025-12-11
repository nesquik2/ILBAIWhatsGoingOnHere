{:name        "rabbit-dog-flower-social-inference"
 :description "FOL reasoning about a social scene involving Rabbit, Dog, and Flower"
 :assumptions {
	;;propositional calc observations
	A1  (Smiling A) 
	A2  (Smiling B)
	A3	(holdingFlower B)
	A4 	(lookingAt B A)
	A5 	(lookingAt A flower)
	A6 	(pointingAtSelf A)
    A7 	(earsUp A)

    ;; commonsense-sh axioms
    A8  (forall (x y) (if (and (holdingFlower x) (lookingAt x y)) (givingFlowerTo x y)))
    A9  (forall (x y) (if (givingFlowerTo x y) (friends x y)))
    A10 (forall (y) (if (and (lookingAt y flower) (pointingAtSelf y)) (happyAboutGift y)))
    A11 (forall (x y) (if (friends x y) (friends y x)))

    ;; emotional inference about possibly being surprised
    A12 (forall (y) (if (earsUp y) (surprised y)))
    }

 :goal  (and
         ;;trying to answer some of the questions from the back of the card
            (happyAboutGift A)	;;  why is the rabbit Smiling
            (friends A B)       ;;  why is the dog giving the rabbit flowers?
            (surprised A)       ;;  did the rabbbit expect the flowers?
        )
}