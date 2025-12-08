{
 :assumptions
 {
   ;; Fact: Dog1 is hugging the cat
   A1  HuggingDog1Cat

   ;; Fact: Dog1 is friendly
   A2  Dog1Friendly

   ;; Fact: Cat is surprised
   A3  CatSurprised

   ;; Fact: Cat did NOT expect the hug
   A4  (not CatExpectedHug)

   ;; Fact: Dog2 is watching
   A5  Dog2Watching

   ;; If cat is surprised → action is unexpected
   A6  (implies CatSurprised ActionUnexpected)

   ;; If dog is friendly → positive intent
   A7  (implies Dog1Friendly PositiveIntent)

   ;; If Dog2 is watching → answer Q1
   A8  (implies Dog2Watching Q1)

   ;; If friendly AND unexpected → answer Q2
   A9  (implies (and Dog1Friendly ActionUnexpected) Q2)

   ;; If cat did not expect hug → answer Q3
   A10 (implies (not CatExpectedHug) Q3)

   ;; If ALL conditions → answer Q4
   A11 (implies
          (and Dog1Friendly ActionUnexpected Dog2Watching)
          Q4)
 }

 ;; ---- Goal: all answers must be true ----
 :goal
 (and Q1 Q2 Q3 Q4)
}
