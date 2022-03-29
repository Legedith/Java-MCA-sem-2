// Write a class to represent adjacencty matrix
public class adjacencyMatrix{
    private int[][] matrix;
    private int size;
    
    public adjacencyMatrix(int size){
        this.size = size;
        matrix = new int[size][size];
    }
    
    public void addEdge(int i, int j){
        matrix[i][j] = 1;
        // matrix[j][i] = 1;
    }
    
    public void removeEdge(int i, int j){
        matrix[i][j] = 0;
        // matrix[j][i] = 0;
    }
    
    public boolean hasEdge(int i, int j){
        return matrix[i][j] == 1;
    }
    
    public int getSize(){
        return size;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sb.append(matrix[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}