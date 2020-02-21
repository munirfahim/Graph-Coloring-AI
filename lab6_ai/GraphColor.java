/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_ai;

/**
 *
 * @author munir
 */
public class GraphColor {
    int V;
    int color[]; 
  
    boolean isSafe(int v, int graph[][], int color[], 
                   int c) 
    { 
        for (int i = 0; i < V; i++) 
            if (graph[v][i] == 1 && c == color[i]) 
                return false; 
        return true; 
    } 
  
    boolean graphColoringUtil(int graph[][], int m, 
                              int color[], int v) 
    { 
        if (v == V) 
            return true; 
  
        for (int c = 1; c <= m; c++) 
        { 
            
            if (isSafe(v, graph, color, c)) 
            { 
                color[v] = c; 
  
                if (graphColoringUtil(graph, m, 
                                      color, v + 1)) 
                    return true; 
  
                color[v] = 0; 
            } 
        } 
  
        return false; 
    } 
  
    boolean graphColoring(int graph[][], int m, int v) 
    { 
        V=v;
        color = new int[V]; 
        for (int i = 0; i < V; i++) 
            color[i] = 0; 
  
        if (!graphColoringUtil(graph, m, color, 0)) 
        { 
            System.out.println("Solution does not exist"); 
            return false; 
        } 
  
        printSolution(color); 
        return true; 
    } 
  
    void printSolution(int color[]) 
    { 
        System.out.println("Solution Exists: Following" + 
                           " are the assigned colors"); 
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " : ");
            if(color[i]==1)
                System.out.print("Red ");
            else if(color[i]==2)
                System.out.print("Blue ");
            else
                System.out.print("Green ");
            System.out.println();
            
        
        }
             
        System.out.println(); 
    } 
}
