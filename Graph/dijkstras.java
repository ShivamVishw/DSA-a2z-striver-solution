import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstras{

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src= s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createdGraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2,4));

        graph[1].add(new Edge(1, 3,7));
        graph[1].add(new Edge(1, 2,1));

        graph[2].add(new Edge(2, 4,3));

        graph[3].add(new Edge(3, 5,1));

        graph[4].add(new Edge(4, 3,2));
        graph[4].add(new Edge(4, 5,5));
    }

    //Pair ko logical way se compare karne ke liye ye sab karna padega 
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int n, int d){
            this.node = n;
            this.dist = d;
        }

        //Now in priority Queue wo kaise samjhega ki compare kise karna hai node ko ya dist ko so uske liye 
        // hame batana padega logic se 

        @Override
        public int compareTo(Pair p2){
            // i.e this.dist ko compare kar rhe h dusre kisi bhi pair p2.dest ke sath
            return this.dist - p2.dist;

            //if we want to orderized by decending order then we have to write 
            //return p2.dist - this.dist;
        }
    }

//**Now Pair class me comparable function ke through power aa gyi hai ki wo ab dist ke base pe compare kar sake */


    // O(E + E logV)
    public static void dijestras(ArrayList<Edge> graph[], int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        //ek distance matrix lelo joki distance ko update karta rahega
        int dist[] = new int[V];
        
        //Now initialize the all the distance infinity intiialy in the distance matrix
        for(int i =0; i<V; i++){
            if(i != src){
                dist[i]= Integer.MAX_VALUE;
            }
        }

        boolean vis[] = new boolean[V];

        //Now initialize the priority queue 
        pq.add(new Pair(0, 0));

        //Now main implemantation will start from here
        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!vis[curr.node]){
                //true kar diya
                vis[curr.node] = true;

                //now assign the neigbhours node with distance by checking relaxation
                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(dist[u]+e.wt < dist[v]){ //relaxation
                        dist[v] = dist[u] + e.wt;

                        //now distance update hogya ab priority queue me to add karna padega na 
                        pq.add(new Pair(v,dist[v]));
                    } 
                    
                }
            }
        }

        //Now Print all
        for(int i = 0; i<V; i++){
            System.out.print(dist[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V =6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createdGraph(graph);

        dijestras(graph, 0, V);
    }
}