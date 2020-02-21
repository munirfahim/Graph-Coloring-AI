
package lab6_ai;

/**
 *
 * @author munir
 */
public class MainClass {
    
        public void addEdge(int adj_matrix[][], int start, int e)
        {
        adj_matrix[start][e] = 1;
        adj_matrix[e][start] = 1;
        }

    public static void main(String[] args) {
       GraphColor Coloring = new GraphColor(); 
        //Creating wiki graph to test with 3 colors 
        int V=10;
        int adjacency_matrix[][]=new int[V][V];
        
         MainClass graph = new MainClass();
            graph.addEdge(adjacency_matrix, 0, 1);
            graph.addEdge(adjacency_matrix, 0, 2);
            graph.addEdge(adjacency_matrix, 0, 5);
            graph.addEdge(adjacency_matrix, 1, 3);
            graph.addEdge(adjacency_matrix, 1, 6);
            graph.addEdge(adjacency_matrix, 2, 4);
            graph.addEdge(adjacency_matrix, 2, 7);
            graph.addEdge(adjacency_matrix, 3, 4);
            graph.addEdge(adjacency_matrix, 3, 8);
            graph.addEdge(adjacency_matrix, 4, 9);
            graph.addEdge(adjacency_matrix, 5, 8);
            graph.addEdge(adjacency_matrix, 2, 9);
            graph.addEdge(adjacency_matrix, 6, 7);
            graph.addEdge(adjacency_matrix, 6, 9);
            graph.addEdge(adjacency_matrix, 7, 8);
        
        
        int colorcount = 3; // Number of colors 
        Coloring.graphColoring(adjacency_matrix, colorcount,V); 
    }
    

}
