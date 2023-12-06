package Ga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Zart 
{
	public static ArrayList<Solution> Feasible(ArrayList<Solution> Intial_PoP,int Max_Weight)
	{
		int Total_Weight=0;
		int length= Intial_PoP.get(0).q.size();
		for(int i=0;i<Intial_PoP.size();i++) 
		{
			for(int j =0;j<length;j++) 
			{
				if(Intial_PoP.get(i).q.get(j).taken==1) 
				{
					Total_Weight+=Intial_PoP.get(i).q.get(j).weight;
				}
			}
			if(Total_Weight>Max_Weight) 
			{
				Intial_PoP.remove(i);
				i--;
			}
			Total_Weight=0;
		}
		return Intial_PoP;
	}
	public static void crossover(ArrayList<Item> arr1,ArrayList<Item> arr2)
	{
		for(int i=0;i<arr1.size();i++) 
		{
			if(i>1) 
			{
				Item tmp = arr2.get(i);
				arr1.set(i, tmp);
			}
		}
		for(int i=0;i<arr1.size();i++) 
		{
			if(i<2) 
			{
				Item tmp = arr1.get(i);
				arr2.set(i, tmp);
			}
		}
	}
	public static void main(String[] args) 
	{
		ArrayList <Solution> s = new ArrayList <Solution>();
		ArrayList <Item> a1 = new ArrayList <Item>();
		ArrayList <Item> a2 = new ArrayList <Item>();
		ArrayList <Item> a3 = new ArrayList <Item>();
		ArrayList <Item> a4 = new ArrayList <Item>();
		Solution l1 = new Solution();
		Solution l2 = new Solution();
		Solution l3 = new Solution();
		Solution l4 = new Solution();
		Item s1 = new Item();
		Item s2 = new Item();
		Item s3 = new Item();
		s1.weight=5;
		s1.value=3;
		s1.taken=1;
		s2.weight=7;
		s2.value=6;
		s2.taken=1;
		s3.weight=4;
		s3.value=4;
		s3.taken=1;
		a1.add(s3);
		a1.add(s2);
		a1.add(s1);
		Item q1 = new Item();
		Item q2 = new Item();
		Item q3 = new Item();
		q1.weight=5;
		q1.value=3;
		q1.taken=1;
		q2.weight=7;
		q2.value=6;
		q2.taken=0;
		q3.weight=4;
		q3.value=4;
		q3.taken=1;
		a2.add(q3);
		a2.add(q2);
		a2.add(q1);
		Item z1 = new Item();
		Item z2 = new Item();
		Item z3 = new Item();
		z1.weight=5;
		z1.value=3;
		z1.taken=1;
		z2.weight=7;
		z2.value=6;
		z2.taken=1;
		z3.weight=4;
		z3.value=4;
		z3.taken=0;
		a3.add(z3);
		a3.add(z2);
		a3.add(z1);
		Item v1 = new Item();
		Item v2 = new Item();
		Item v3 = new Item();
		v1.weight=5;
		v1.value=3;
		v1.taken=1;
		v2.weight=7;
		v2.value=6;
		v2.taken=1;
		v3.weight=4;
		v3.value=4;
		v3.taken=1;
		a4.add(v3);
		a4.add(v2);
		a4.add(v1);
		l1.q=a1;
		l2.q=a2;
		l3.q=a3;
		l4.q=a4;
		
		s.add(l2);
		s.add(l3);
		s.add(l4);
		s.add(l1);
		for(int i =0;i<s.size();i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(s.get(i).q.get(j).taken);
			}
			System.out.println();
		}
		//Item [] array =  s.get(0).q.toArray(new Item[s.get(0).q.size()]);
		//Item [] array2 = s.get(1).q.toArray(new Item[s.get(1).q.size()]);
		crossover(s.get(0).q,s.get(1).q);
		for(int i =0;i<s.size();i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(s.get(i).q.get(j).taken);
			}
			System.out.println();
		}
		/*for(int i=0;i<s.size();i++) 
		{
			Set<Item> set = new HashSet<>(s.get(i).q);
			s.get(i).q.clear();
			s.get(i).q.addAll(set);
		}*/
		/*for(int i =0;i<s.size();i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(s.get(i).q.get(j).taken);
			}
			System.out.println();
		}*/
		/*Set<String> set = new HashSet<>(yourList);
		yourList.clear();
		yourList.addAll(set);*/
		ArrayList <Solution> sol = Feasible(s,10);
		System.out.println("AFter Change");
		for(int i =0;i<sol.size();i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(sol.get(i).q.get(j).taken);
			}
			System.out.println();
		}
	}
}
