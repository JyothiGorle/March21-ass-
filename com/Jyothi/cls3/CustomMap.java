package com.Jyothi.cls3;
/*CustomMap Implementation: Create a class named CustomMap that implements the Map interface. Override the put() and get() methods

 *  to provide a custom implementation. The put() method should store the key-value pair in a custom data structure 
 *  (e.g., a list or an array) and the get() method should retrieve the value associated with the given key from the custom 
 *  data structure. Ensure that your implementation adheres to the contract defined by the Map interface. 
 *  Test your CustomMap implementation by creating instances of CustomMap, adding key-value pairs, and retrieving values 
 *  using the get() method. Also, ensure that your implementation handles edge cases such as handling null keys and values 
 *  appropriately. Additionally, you can write unit tests to verify the correctness of your implementation.
 */
import java.util.*;
public class CustomMap<K,V>{
	private class Node{
		K key;
		V value;
		public Node(K key,V value)
		{
			this.key=key;
			this.value=value;
		}
	}
	private int noofnodes;
	private int noofbuckets;
	private LinkedList<Node>buckets[];
	public CustomMap()
	{
		this.noofbuckets=4;
		this.buckets=new LinkedList[4];
		for(int i=0;i<4;i++)
		{
			this.buckets[i]=new LinkedList<>();
		}
	}
	private int hashFunction(K key)
	{
		int bucketindex=key.hashCode();
		return Math.abs(bucketindex)%noofbuckets;
	}
	private int searchInLL(K key,int bucketindex)
	{
		LinkedList<Node>ll=buckets[bucketindex];
		for(int i=0;i<ll.size();i++)
		{
			if(ll.get(i).key==key)
				return i;
		}
		return -1;
	}
	private void rehash()
	{
		LinkedList<Node>oldbucket[]=buckets;
		buckets=new LinkedList[noofbuckets*2];
		for(int i=0;i<noofbuckets*2;i++)
		{
			buckets[i]=new LinkedList<>();
		}
		for(int i=0;i<oldbucket.length;i++)
		{
			LinkedList<Node>ll=oldbucket[i];
			for(int j=0;j<ll.size();j++)
			{
				Node node=ll.get(j);
				put(node.key,node.value);
			}
		}
	}
	public void put(K key,V value)
	{
		int bucketindex=hashFunction(key);
		int dataindex=searchInLL(key,bucketindex);
		if(dataindex==-1)
		{
			buckets[bucketindex].add(new Node(key,value));
			noofnodes++;
		}
		else {
			Node node=buckets[bucketindex].get(dataindex);
			node.value=value;
		}
		double lambda=(double)noofnodes/noofbuckets;
		if(lambda>2.0)
			rehash();
	}
	public boolean containskey(K key)
	{
		int bucketindex=hashFunction(key);
		int dataindex=searchInLL(key,bucketindex);
		if(dataindex==-1)
		{
			return false;
		}
		else {
			return true;
		}
		
	}
	public V remove(K key)
	{
		int bucketindex=hashFunction(key);
		int dataindex=searchInLL(key,bucketindex);
		if(dataindex==-1)
			return null;
		else
		{
			Node node=buckets[bucketindex].remove(dataindex);
			noofnodes--;
			return node.value;
		}
	}
	public V get(K key)
	{
		int bucketindex=hashFunction(key);
		int dataindex=searchInLL(key,bucketindex);
		if(dataindex==-1)
		{
			return null;
		}
		else {
			Node node=buckets[bucketindex].get(dataindex);
			return node.value;
		}
	}
	public ArrayList<K>keySet()
	{
		ArrayList<K>keys=new ArrayList<>();
		for(int i=0;i<buckets.length;i++)
		{
			LinkedList<Node>ll=buckets[i];
			for(int j=0;j<ll.size();j++)
			{
				Node node=ll.get(j);
				keys.add(node.key);
			}
		}
		return keys;
	}
	public boolean isEmpty()
	{
		return noofnodes==0;
	}
	
}
