{:assumptions
  {A1 (Kitten yellowKitten)
   A2 (Kitten grayKitten)
   A3 (Cat parentCat)

   ;; They just played a soccer game.
   A4 (PlayedSoccerGame yellowKitten)
   A5 (PlayedSoccerGame grayKitten)

   ;; Yellow kitten’s team won and gray kitten’s team lost.
   A6 (WonGame yellowKitten)
   A7 (LostGame grayKitten)

   ;; How they feel after the game.
   A8 (if (WonGame yellowKitten)
         (Feels yellowKitten happy))
   A9 (if (LostGame grayKitten)
         (Feels grayKitten annoyed))

   ;; Parent is focused on celebrating with the yellow kitten.
   A10 (CelebratesWith parentCat yellowKitten)

   ;; If the parent is celebrating with the yellow kitten,
   ;; the parent is paying attention to the yellow kitten's feelings.
   A11 (if (CelebratesWith parentCat yellowKitten)
          (NoticesEmotion parentCat yellowKitten happy))

   ;; Because the parent is focused only on the winner,
   ;; the parent does not notice the gray kitten’s annoyance.
   A12 (if (CelebratesWith parentCat yellowKitten)
          (not (NoticesEmotion parentCat grayKitten annoyed)))}

 :goal
   ;; - both kittens played
   ;; - the gray kitten is annoyed
   ;; - the parent does not notice the gray kitten's annoyance
   (and (PlayedSoccerGame yellowKitten)
        (PlayedSoccerGame grayKitten)
        (Feels grayKitten annoyed)
        (not (NoticesEmotion parentCat grayKitten annoyed)))}