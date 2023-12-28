import java.util.ArrayList;

public class bellmanFord{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src= s;
            this.dest= d;
            this.wt= w;
        }
    }
    static void createdGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -10));
    } 

    public static void bellMan(ArrayList<Edge> graph[], int src, int V){
        int dist[] = new int[V];
        
        //initially infinity
        for(int i=0; i<dist.length; i++){
            if(i !=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        
        for(int i=0; i<V-1; i++){
            for(int j=0; j<V-1; j++){
                for(int k=0; k<graph[j].size(); k++){
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u]!= Integer.MAX_VALUE && dist[u]+ e.wt < dist[v]){
                        dist[v]= dist[u] + e.wt;
                    }
                }
            }
        }

    // detect negetive cycle (It will run only when there is cycle a cycle whose whole length is negetive)
        for(int j=0; j<V; j++){
            for(int k=0; k<graph[j].size(); k++){
                Edge e = graph[j].get(k);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if(dist[u]!= Integer.MAX_VALUE && dist[u]+ e.wt < dist[v]){
                    System.out.println("negetive wt cycle");
                    break;
                }
            }
        }
        for(int l=0; l< V; l++){
                System.out.print(dist[l]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createdGraph(graph);
        bellMan(graph, 0, V);
    }
}