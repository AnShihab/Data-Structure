package Main;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS 
{
	LinkedList<Integer>[] adj;
	int num;
	char[] nodes;
	boolean[] visited;
	
	public BFS(LinkedList<Integer>[] adj,int num,boolean[] visited,char[] nodes)
	{
		this.adj=adj;
		this.num=num;
		this.nodes=nodes;
		this.visited=visited;
	}
	
	public void addEdges(int start,int end)
	{
		adj[start].add(end);
	}
	
	public void breadthFirstSearch(int start)
	{
		LinkedList<Integer> queue=new LinkedList<Integer>();
		visited[start]=true;
		queue.add(start);
		while(queue.size()!=0)
		{
			start=queue.pollFirst();
			System.out.print(nodes[start]+" ");
			Iterator<Integer> i =adj[start].listIterator();
			while(i.hasNext())
			{
				int n=i.next();
				if(!visited[n])
				{
					queue.add(n);
					visited[n]=true;
				}
			}
			
		}
	}
}
