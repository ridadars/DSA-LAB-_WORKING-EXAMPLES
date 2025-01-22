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
    private final Stack<Integer> stack;

    Graph(int size) {
        vertices = new ArrayList<>();
        adjacencyMatrix = new int[size][size];
        stack = new Stack<>();
    }

    // Add vertex to the graph
    public void addVertex(String label) {
        vertices.add(new Vertex(label));
    }

    // Add edge between vertices
    public void addEdge(int start, int end) {
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1; // For undirected graph
    }

    // Display a vertex
    public void displayVertex(int index) {
        System.out.print(vertices.get(index).label + " ");
    }

    // Perform DFS
    public void dfs() {
        vertices.get(0).visited = true;
        displayVertex(0);
        stack.push(0);

        while (!stack.isEmpty()) {
            int vertexIndex = getUnvisitedNeighbor(stack.peek());

            if (vertexIndex == -1) {
                stack.pop();
            } else {
                vertices.get(vertexIndex).visited = true;
                displayVertex(vertexIndex);
                stack.push(vertexIndex);
            }
        }

        // Reset visited flags
        for (Vertex vertex : vertices) {
            vertex.visited = false;
        }
    }

    // Get unvisited neighbor of a vertex
    private int getUnvisitedNeighbor(int vertexIndex) {
        for (int i = 0; i < vertices.size(); i++) {
            if (adjacencyMatrix[vertexIndex][i] == 1 && !vertices.get(i).visited) {
                return i;
            }
        }
        return -1;
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        // Adding vertices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        // Adding edges
        graph.addEdge(0, 1); // A-B
        graph.addEdge(0, 2); // A-C
        graph.addEdge(1, 3); // B-D
        graph.addEdge(2, 3); // C-D
        graph.addEdge(3, 4); // D-E

        // Perform DFS
        System.out.println("Depth-First Search traversal:");
        graph.dfs();
    }
}
