import java.util.ArrayList;
public class weightedUndirected{
    //Firstly make edge class which will take care about edge and each edge will contain 
    //source of that vertices and destination and weight becoz of weithed graph
    static class Edge{
        int src;
        int dest;
        int wt;

        //CONSTRUCTER
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    

    //make method to create graph
    public static void createdGraph(ArrayList<Edge> graph[]){

        //Now craete empty arraylist for each node becoz initialy wo null hai to null 
        //ko ham directly arrraylist nhi consider kar sakte hai
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        //we have succesfully created empty arraylist for each node

        //Now add the edge
        graph[0].add(new Edge(0, 2,2));
        
        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));

    }


    public static void main(String[] args) {
        //Number of vertexes
        int V =4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createdGraph(graph);

        //print 2's neibhours
        //Similarly we can get any neibhours element
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest +" "+e.wt);
        }
        System.out.println();

    }
}