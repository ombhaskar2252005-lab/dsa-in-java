import java.util.*;
public class treeBySir {
    public static List<List<Integer>> createTree(int n, int[][] edges){
        List<List<Integer>> lst = new ArrayList<>();
        for(int i =0; i<n; i++){
            lst.add(new ArrayList<>());
        }
        for(int i =0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            lst.get(u).add(v);
            lst.get(v).add(u);
        }
        return lst;
    }
    public static void display(List<List<Integer>> lst){
        for(int i =0; i<lst.size(); i++){
            System.out.print(i + " --> ");
            for(int ele : lst.get(i)){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        public static void dfs(int node, boolean[]vis, List<List<Integer>> lst){
            System.out.print(node + " ");
            vis[node] = true;
            int count =0;
            for(int ele : lst.get(node)){
                if(!vis[ele]){
                    count++;
                    dfs(ele,vis,lst);
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] edges ={{0,1},{1,2},{2,3},{3,0},{0,2},{4,5},{5,6},{4,6},{7,8}};
        int v = 9;
        List<List<Integer>> adjust = createTree(v, edges);
        display(adjust);
        boolean[] vis = new boolean[v];
        for(int i =0; i<v; i++){
            if(!vis[i]){
                dfs(i,vis,adjust);
            }
        }
    }
}
