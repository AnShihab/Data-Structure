package Main;
import java.util.*;
public class Main 
{

	public static void main(String[] args) 
	{
		
		int num=9;
		char[] nodes= {'A','B','C','D','E','F','G','H','I','J','K'};
		boolean[] visited=new boolean[num];
		LinkedList<Integer>[] adj= new LinkedList[num];
		for(int i=0;i<num;i++)
		{
			adj[i]=new LinkedList<>();
		}
		
		
		
		
		BFS bfs=new BFS(adj,num,visited,nodes);
		bfs.addEdges(0,5); bfs.addEdges(0,2); bfs.addEdges(0,1);
		bfs.addEdges(1,0); bfs.addEdges(1,2); bfs.addEdges(1,4);
		bfs.addEdges(2,0); bfs.addEdges(2,1); bfs.addEdges(2,4); bfs.addEdges(2,5); bfs.addEdges(2,6);
		bfs.addEdges(3,2); bfs.addEdges(3,5); bfs.addEdges(3,4); bfs.addEdges(3,6);
		bfs.addEdges(4,2); bfs.addEdges(4,3); bfs.addEdges(4,6); bfs.addEdges(4,7); bfs.addEdges(4,8);
		bfs.addEdges(5,0); bfs.addEdges(5,2); bfs.addEdges(4,3);
		bfs.addEdges(6,1); bfs.addEdges(6,2); bfs.addEdges(6,4); bfs.addEdges(6,8);
		bfs.addEdges(7,3); bfs.addEdges(7,5); bfs.addEdges(7,8);
		bfs.addEdges(8,4); bfs.addEdges(8,6); bfs.addEdges(8,7);
		//bfs.breadthFirstSearch(0);
		System.out.println();
		DFS dfs=new DFS(adj,num,visited,nodes);
		dfs.addEdges(0,5); dfs.addEdges(0,2); dfs.addEdges(0,1);
		dfs.addEdges(1,0); dfs.addEdges(1,2); dfs.addEdges(1,4);
		dfs.addEdges(2,0); dfs.addEdges(2,1); dfs.addEdges(2,4); dfs.addEdges(2,5); dfs.addEdges(2,6);
		dfs.addEdges(3,2); dfs.addEdges(3,5); dfs.addEdges(3,4); dfs.addEdges(3,6);
		dfs.addEdges(4,2); dfs.addEdges(4,3); dfs.addEdges(4,6); dfs.addEdges(4,7); dfs.addEdges(4,8);
		dfs.addEdges(5,0); dfs.addEdges(5,2); dfs.addEdges(4,3);
		dfs.addEdges(6,1); dfs.addEdges(6,2); dfs.addEdges(6,4); dfs.addEdges(6,8);
		dfs.addEdges(7,3); dfs.addEdges(7,5); dfs.addEdges(7,8);
		dfs.addEdges(8,4); dfs.addEdges(8,6); dfs.addEdges(8,7);
		
		System.out.println();
		dfs.depthFirstSearch(0);
		
	}

}
