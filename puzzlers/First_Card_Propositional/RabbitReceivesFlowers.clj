;propositional test
{:assumptions {A1 (if A_receives_flowers A_happy)
               A2 (if B_gives_flowers_to_A A_receives_flowers)
               A3 (if B_holds_flowers_for_A B_gives_flowers_to_A)
               A4 B_holds_flowers_for_A
                }
 :goal (and A_happy (implies B_holds_flowers_for_A A_happy))}   
