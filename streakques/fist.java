package streakques;

class fist {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // Step 1: Edge Case - Agar kisi ka bhi Area 0 hai (Line ya Point), toh overlap nahi ho sakta
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] || 
            rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
            return false;
        }

        // Step 2: The 4 "No Overlap" Conditions
        // Agar inme se ek bhi sach nikli, matlab Overlap NAHI hai!
        if (rec1[2] <= rec2[0] ||  // 1. rec1 is strictly LEFT of rec2
            rec1[0] >= rec2[2] ||  // 2. rec1 is strictly RIGHT of rec2
            rec1[3] <= rec2[1] ||  // 3. rec1 is strictly BELOW rec2
            rec1[1] >= rec2[3]) {  // 4. rec1 is strictly ABOVE rec2
            
            return false;
        }

        // Agar upar ki koi bhi condition true nahi hui, matlab dono takra (overlap kar) gaye!
        return true; 
    }
}