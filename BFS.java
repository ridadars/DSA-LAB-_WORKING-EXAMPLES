/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rida
 */
import java.util.*;

class Vertex {
    String label;
    boolean visited;

    Vertex(String label) {
        this.label = label;
        this.visited = false;
    }
}

class Graph {
    private final List<Vertex> vertices;
    private final int[][] adjacencyMatrix;
    private final Queue<Integer> queue;

    Graph(int size) {
        vertices = new ArrayList<>();
        adjacencyMatrix = new int[size][size];
        queue = new LinkedList<>();
    }

    
    public void addVertex(String label) {
        vertices.add(new Vertex(label));
    }

    
    public void addEdge(int start, int end) {
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1; 
    }

    
    public void displayVertex(int index) {
        System.out.print(vertices.get(index).label + " ");
    }

    
    public void bfs() {
        vertices.get(0).visited = true;
        displayVertex(0);
        queue.add(0);

        while (!queue.isEmpty()) {
            int vertexIndex = queue.poll();

            int neighbor;
            while ((neighbor = getUnvisitedNeighbor(vertexIndex)) != -1) {
                vertices.get(neighbor).visited = true;
                displayVertex(neighbor);
                queue.add(neighbor);
            }
        }

        
        for (Vertex vertex : vertices) {
            vertex.visited = false;
        }
    }

    
    private int getUnvisitedNeighbor(int vertexIndex) {
        for (int i = 0; i < vertices.size(); i++) {
            if (adjacencyMatrix[vertexIndex][i] == 1 && !vertices.get(i).visited) {
                return i;
            }
        }
        return -1;
    }
}

public class BFS {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        
        graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(1, 3); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 4); 

        
        System.out.println("Breadth-First Search traversal:");
        graph.bfs();
    }
}