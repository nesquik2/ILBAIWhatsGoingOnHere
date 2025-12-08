{:assumptions
  {A1 (Dog dog1)                     ;; dog1 = dog up in the tree
   A2 (Dog dog2)                     ;; dog2 = dog on the ground
   A3 (Fox fox)

   ;; Facts about the situation
   A4 (InTree dog1)
   A5 (OnLoosePlank dog1)

   ;; If a dog is in a tree on a loose plank, that dog is in danger.
   A6 (if (and (InTree dog1)
               (OnLoosePlank dog1))
         (InDanger dog1))

   ;; Ground dog (dog2) believes dog1 is in danger.
   A7 (Believes! dog2 (InDanger dog1))

   ;; If dog2 believes dog1 is in danger, dog2 shouts a warning.
   A8 (if (Believes! dog2 (InDanger dog1))
         (ShoutsWarning dog2 dog1))

   ;; The fox can help dog1.
   A9 (CanHelp fox dog1)

   ;; If dog1 is in danger and the fox can help, the fox should help dog1.
   A10 (if (and (InDanger dog1)
                (CanHelp fox dog1))
          (ShouldHelp fox dog1))}

 :goal
   ;; Answers the card’s questions:
   ;; - Who is in danger?      -> (InDanger dog1)
   ;; - What is the dog shouting? -> (ShoutsWarning dog2 dog1)
   ;; - What should the fox do?   -> (ShouldHelp fox dog1)
   (and (InDanger dog1)
        (ShoutsWarning dog2 dog1)
        (ShouldHelp fox dog1))}