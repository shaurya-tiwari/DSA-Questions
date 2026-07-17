public class RotateImage {
    
    public void rotate(int[][] matrix) {
     
        int  n = matrix.length;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix.length; j++) {
            matrix[i][j] = matrix[i][j] ^ matrix[j][i];
            matrix[j][i] = matrix[i][j] ^ matrix[j][i];
            matrix[i][j] = matrix[i][j] ^ matrix[j][i];
            }
            int start = 0;
            int end = col-1;
            while (start<end) {
             // Aapki XOR swap technique matrix row ke liye
            matrix[i][start] ^= matrix[i][end];
            matrix[i][end]   ^= matrix[i][start];
            matrix[i][start] ^= matrix[i][end];
        }
        }
    }


    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


    }
}
    
