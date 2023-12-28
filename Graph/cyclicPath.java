import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

//Kuch modification karenge dfs me ham that's it (basically we can say that Modified dfs code)  O(V+e)
//Directed

class cyclicPath{
    //Firstly make edge class which will take care about edge and 
    //each edge will contain source of that vertices and destination
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

        //Now craete empty arraylist for each node becoz initialy wo null hai to 
        //null ko ham directly arrraylist nhi consider kar sakte hai
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        //we have succesfully created empty arraylist for each node

        //Now add the edge
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));

    }

    public static boolean isCyclicPath(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]){
        
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                // i.e. cyclic hai 
                return true;
            }else if(!vis[e.dest]){
                //agar neibghour ke yaha hi cycle exist karta hai to true return hoga
                if(isCyclicPath(graph, vis, e.dest, rec)){
                    return true;
                }                
            }
        }

        rec[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        //Number of vertices
        int V =4;
        
        ArrayList<Edge> graph[] = new ArrayList[V];
        createdGraph(graph);

        System.out.println(isCyclicPath(graph, new boolean[V] , 0, new boolean[V]));
        
        System.out.println();
    }
}