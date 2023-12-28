import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class dfs{
    //Firstly make edge class which will take care about edge and 
    // each edge will contain source of that vertices and destination
    static class Edge{
        int src;
        int dest;

        //CONSTRUCTER
        public Edge(int s, int d ){
            this.src = s;
            this.dest = d;
        }
    }

    //make method to create graph
    public static void createdGraph(ArrayList<Edge> graph[]){

        //Now craete empty arraylist for each node becoz initialy wo null 
        //hai to null ko ham directly arrraylist nhi consider kar sakte hai
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        //we have succesfully created empty arraylist for each node

        //Now add the edge
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

    }

    public static void dfsImp(ArrayList<Edge> graph[], int curr, boolean vis[]){
        //print curr node
        System.out.print(curr+" ");

        //make curr node visited on booolean visited aray
        vis[curr] = true;

        //now call dfs for neighour node
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(vis[e.dest] ==false){
                dfsImp(graph, e.dest, vis);
            }
            
        }
    
    }
    public static void main(String[] args) {
        //Number of vertexes
        int V =7;
        boolean vis[] = new boolean[V];
        ArrayList<Edge> graph[] = new ArrayList[V];
        createdGraph(graph);

        //statrting me current 0 hoga
        dfsImp(graph, 0, vis);
        System.out.println();
    }
}