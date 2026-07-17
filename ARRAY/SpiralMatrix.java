import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// peling the onion approach , -------------------------------------------------------------------------------------------------------
// Is approach ko chalane ke liye hum matrix ke chaaron taraf 4 Borders (Deewarein) khadi kar dete hain:

// top: Sabse upar wali row (shuruat mein 0).

// bottom: Sabse neeche wali row (shuruat mein rows - 1).

// left: Sabse left wala column (shuruat mein 0).

// right: Sabse right wala column (shuruat mein cols - 1).

// Jab aap pehla chakkar lagate hain:

// Left se Right jaate hain top wali row par. Ab top row ka kaam khatam, toh pyaaz chheel do: top++ (deewar ek kadam neeche aa gayi).

// Top se Bottom jaate hain right wale column par. right column ka kaam khatam: right-- (deewar ek kadam left aa gayi).

// Right se Left jaate hain bottom wali row par. bottom row ka kaam khatam: bottom-- (deewar ek kadam upar chali gayi).

// Bottom se Top jaate hain left wale column par. left column ka kaam khatam: left++ (deewar ek kadam right chali gayi).
// public class SpiralMatrix {2. KAISE KAAM KARTA HAI? (The 4-Wall Setup)

//  reqired steps 
// step 1 : create boundaries , top, right , left , bottom ,
// step 2 : main while loop (loop - left to right tp ++) . (loop 2 - top to bottom , right --), (if-{lopp - right to left , bottom -- }, if - { loop - bottom to top left++ } )
//  

public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();       
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = col-1;
        int top = 0;
        int bottom = row -1;

        while (top<=bottom && left<= right) {
            
        
        //to right 
       for (int i = left; i <= right; i++) {
        result.add(matrix[top][i]); // left to rght measn add top layer of the 2d array 
       }
       top++;
       //top to bottom means , right side of the 2d array 
       for (int j = top; j <= bottom; j++) {
        result.add(matrix[j][right]); // add right side elemts     now rogh will columnm here bcoz we are moving in the column 
       }
       right --;

       // left to right 
        if (top<=bottom) {
                for (int j2 = right; j2 >=left; j2--) {
                result.add(matrix[bottom][j2]);
            }
            bottom--;
        }
       // bottom to top 
      if (left<=right) {
         for (int k = bottom; k >= top; k--) {
            result.add(matrix[k][left]);
       }
       left ++;

      }
    }
    return result;
        
    }




