{
 :logic :prop

 :assumptions
 {
   ;; Basic facts
   A1 FoxKidsFightingOverTruck
   A2 TruckValuable
   A3 AdultFoxWatching
   A4 AdultFoxWantsSharing
   A5 BothKidsWantTruck

   ;; Conflict requires two things:
   ;; fighting -> wanting same toy
   A6 (implies FoxKidsFightingOverTruck WantingSameToy)

   ;; wanting same toy + valuable truck -> conflict
   A7 (implies (and WantingSameToy TruckValuable) Conflict)

   ;; Q1 from conflict
   A8 (implies Conflict Q1)

   ;; Q2 from both wanting the toy
   A9 (implies BothKidsWantTruck Q2)

   ;; Q3 from adult watching
   A10 (implies AdultFoxWatching Q3)

   ;; Q4 requires all three conditions
   A11 (implies (and Conflict AdultFoxWatching AdultFoxWantsSharing) Q4)

   ;; Final combination rule
   A12 (implies (and Q1 Q2 Q3 Q4) AllAnswers)
 }

 :goal
 AllAnswers
}
