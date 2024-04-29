public class addtwomat {
    
    public static int [] [] addmatrix(int [] [] A, int [][] B,){
        int row = A.length;
        int cols = A[0].length;
        int [] [] result = new int [row],[cols];
        for (int i=0;i<rows; i++){
            for (int j=0;j<cols; j++){
                reslut [i][j] = A[i][j] + B[i][j];
        }
    }
    return result;


    public static void main(String[] args) {
        
        int A[] []= {{1,2,3},{2,3,4},{4,2,3}};
        int B[] []= {{1,2,3},{2,3,4},{4,2,3}};
        int [] [] result = addmatrix(A,B);
        System.out.println("resultant matrix");
        for (int i=0;i<result.length;i++){
            for(int j=0;j<result.length;j++){
                System.out.println(result[i][j]+" ");
        }
        System.out.prinln();

    }
}
