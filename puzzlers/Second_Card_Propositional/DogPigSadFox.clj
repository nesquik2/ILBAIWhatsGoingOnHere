{:name        "fox-dog-pig-propositional-minimal-A"
 :assumptions {
   ;; observations, using labels in place of what would be predicates in FOL
   A1  talking_ab
   A2  smiling_a
   A3  smiling_b
   A4  sitting_ab
   A5  (not sitting_ca)
   A6  (not sitting_cb)
   A7  looking_c_a
   A8  looking_c_b
   A9  (not smiling_c)
   A10 (not laughing_c)

   A11 (if (and talking_ab smiling_a smiling_b sitting_ab) included_ab)
   A12 (if (and included_ab (not sitting_ca) (not sitting_cb) looking_c_a looking_c_b (not smiling_c) (not laughing_c)) might_excluded_c)
   A13 (if might_excluded_c wants_join_c)
   A14 (if might_excluded_c feeling_c_sad)
   A15 (if (and included_ab might_excluded_c) possibly_being_mean_ab_c)
 }

 :goal (and wants_join_c feeling_c_sad possibly_being_mean_ab_c)
}
