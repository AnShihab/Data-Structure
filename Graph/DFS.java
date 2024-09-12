package Main;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS 
{
	LinkedList<Integer>[] adj;
	int num;
	char[] nodes;
	boolean[] visited;
	
	public DFS(LinkedList<Integer>[] adj,int num,boolean[] visited,char[] nodes)
	{
		this.adj=adj;
		this.num=num;
		this.visited=visited;
		this.nodes=nodes;
	}
	
	public void addEdges(int start,int end)
	{
		adj[start].add(end);
	}
	
	public void depthFirstSearch(int start)
	{
		LinkedList<Integer> stack=new LinkedList<Integer>();
		visited[start]=true;
		stack.add(start);
		while(stack.size()!=0)
		{
			start=stack.pollLast();
			System.out.print(nodes[start]+" ");
			Iterator<Integer> i=adj[start].listIterator();
			while(i.hasNext())
			{
				int n=i.next();
				if(!visited[n])
				{
					stack.add(n);
					visited[n]=true;
				}
			}
		}
	}
}

