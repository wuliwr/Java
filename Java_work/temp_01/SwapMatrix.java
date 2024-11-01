public class SwapMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] temp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
                temp[i][j] = matrix[i][j];
            }
        }
        System.out.println();
        System.out.print("显示出的结果为:");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = temp[j][i];
                System.out.print(matrix[i][j] + " ");
            }
            
            }
        }
}