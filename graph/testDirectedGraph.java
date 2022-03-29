public class testDirectedGraph {
    public static void main(String[] args)
    {
        // create a directed graph with 5 vertices
        directedGraph graph = new directedGraph(5);
        // add edges 0->1, 0->2, 1->3, 2->4, 3->1, 3->4, 4->1, 4->2, 4->3
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);
        graph.addEdge(4, 2);
        graph.addEdge(4, 3);
        // print the adjacency matrix of the graph
        System.out.println("Adjacency matrix of the graph: ");
        System.out.println(graph.toString());
        // print maximum indegree of the graph
        System.out.println("Maximum indegree of the graph: " + graph.maxIndegree());
        // print minimum outdegree of the graph
        System.out.println("Minimum outdegree of the graph: " + graph.minOutdegree());
        // print the path graph of the graph
        System.out.println("Path graph of the graph: ");
        graph.pathGraph();
    }
}
