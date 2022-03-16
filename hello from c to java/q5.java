// Write a function "int[][] matMultiply(int[][] mat1, int[][] mat2)" which takes two matrices (as two dimensional arrays) as argument and returns its product as return value.
public class q5 {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat3 = matMultiply(mat1, mat2);
        for(int i=0; i<mat3.length; i++){
            for(int j=0; j<mat3[i].length; j++){
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] matMultiply(int[][] mat1, int[][] mat2){
        int[][] mat3 = new int[mat1.length][mat2[0].length];
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat2[0].length; j++){
                for(int k=0; k<mat1[0].length; k++){
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return mat3;
    }
}
