// Implemented Directed graph using adjacency matrix
public class directedGraph{
    private adjacencyMatrix matrix;
    // Constructor
    public directedGraph(int size){
        matrix = new adjacencyMatrix(size);
    }

    // Implement functions to add and remove edges
    public void addEdge(int i, int j){
        matrix.addEdge(i, j);
    }
    public void removeEdge(int i, int j){
        matrix.removeEdge(i, j);
    }
    public boolean hasEdge(int i, int j){
        return matrix.hasEdge(i, j);
    }
    public int getSize(){
        return matrix.getSize();
    }
    public String toString(){
        return matrix.toString();
    }
    // Write functions to 
    // a. To return the maximum indegree in the graph
    // b. To return the minimum outdegree in the graph.
    // c. To return the Path Graph of the given directed graph using Warshall's algorithm.

    public int maxIndegree(){
        int max = 0;
        // Directed graph
        for(int i = 0; i < matrix.getSize(); i++){
            int count = 0;
            for(int j = 0; j < matrix.getSize(); j++){
                if(matrix.hasEdge(j, i)){
                    count++;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
    public int minOutdegree(){
        int min = matrix.getSize();
        for(int i = 0; i < matrix.getSize(); i++){
            int count = 0;
            for(int j = 0; j < matrix.getSize(); j++){
                if(matrix.hasEdge(i, j)){
                    count++;
                }
            }
            if(count < min){
                min = count;
            }
        }
        return min;
    }
    public void pathGraph()
    {
        int[][] newMatrix = new int[matrix.getSize()][matrix.getSize()];
        for(int i = 0; i < matrix.getSize(); i++){
            for(int j = 0; j < matrix.getSize(); j++){
                if(matrix.hasEdge(i, j)){
                    newMatrix[i][j] = 1;
                }
                else{
                    newMatrix[i][j] = 0;
                }
            }
        }
        for(int k = 0; k < matrix.getSize(); k++){
            for(int i = 0; i < matrix.getSize(); i++){
                for(int j = 0; j < matrix.getSize(); j++){
                    if(newMatrix[i][k] == 1 && newMatrix[k][j] == 1){
                        newMatrix[i][j] = 1;
                    }
                }
            }
        }
        System.out.println("Path Graph");
        for(int i = 0; i < matrix.getSize(); i++){
            for(int j = 0; j < matrix.getSize(); j++){
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}