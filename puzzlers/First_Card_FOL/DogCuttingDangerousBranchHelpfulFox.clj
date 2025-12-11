{:assumptions
  {A1 (Dog dog1)
   A2 (Dog dog2)
   A3 (Fox fox)

   ;; Facts about the situation
   A4 (InTree dog1)
   A5 (OnLooseBranch dog1)

   ;; If a dog is in a tree on a loose plank, that dog is in danger.
   A6 (if (and (InTree dog1)
               (OnLooseBranch dog1))
         (InDanger dog1))

   ;; If a dog is in danger, the other dog shouts a warning.
   A7 (if (InDanger dog1)
         (ShoutsWarning dog2 dog1))

   ;; The fox can help dog1.
   A8 (CanHelp fox dog1)

   ;; If dog1 is in danger and the fox can help, the fox should help dog1.
   A9 (if (and (InDanger dog1)
               (CanHelp fox dog1))
         (ShouldHelp fox dog1))}

 :goal
   (and (InDanger dog1)
        (ShoutsWarning dog2 dog1)
        (ShouldHelp fox dog1))}
