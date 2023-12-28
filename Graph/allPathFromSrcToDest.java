import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

//Kuch modification karenge dfs me ham that's it 
//(basically we can say that Modified dfs code)  O(V^V)
// it works best for small path  
class allPathFromSrcToDest{
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

    public static void printAllPath(ArrayList<Edge> graph[], int curr,boolean visited[],String path, int target){
        
        //base case
        if(curr == target){
            System.out.println(path);
            return;
        }

        for(int i=0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            //now if not visited then use visit karo aur waps aate samay use unvisited 
            // karo so that sare path travel kare nhito stuck ho jayega ek path ke baad
            if(!visited[e.dest]){
                visited[curr] = true;
                printAllPath(graph, e.dest, visited, path+e.dest, target);

                //waps aate samay use unvisited kar denge 
                visited[curr] = false;
            }
        }    
    }
    public static void main(String[] args) {
        //Number of vertices
        int V =7;
        
        ArrayList<Edge> graph[] = new ArrayList[V];
        createdGraph(graph);

        int src =0;
        int target =5;
        //path starting me "0" hi hoga
        printAllPath(graph, src, new boolean[V], "0", target);
        
        System.out.println();
    }
}