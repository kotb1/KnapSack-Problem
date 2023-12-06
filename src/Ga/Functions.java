package Ga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Functions 
{
	public ArrayList<Solution> Feasible(ArrayList<Solution> Intial_PoP,int Max_Weight)
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
	public ArrayList<Solution> Fitness_Evaluation(ArrayList<Solution> Intial_PoP)
	{
		int Total_value=0;
		int length= Intial_PoP.get(0).q.size();
		for(int i=0;i<Intial_PoP.size();i++) 
		{
			for(int j =0;j<length;j++) 
			{
				if(Intial_PoP.get(i).q.get(j).taken==1) 
				{
					Total_value+=Intial_PoP.get(i).q.get(j).value;
				}
			}
			Intial_PoP.get(i).fitness=Total_value;
			Total_value=0;
		}
		return Intial_PoP;
	}
	/*public void crossover(Item[] arr1,Item arr2[],int pos)
	{
		for(int i = pos;i < arr1.length; i++) 
		{
			Item temp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp;
		}
	}*/
	public void crossover(ArrayList<Item> arr1,ArrayList<Item> arr2)
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
	public void Mutation (ArrayList <Item> Items)
	{
		Random rand= new Random();
		int upperbound = 100;
		for(int i =0;i<Items.size();i++) 
		{
			int int_random = rand.nextInt(upperbound);
			if(int_random >95) 
			{
				if(Items.get(i).taken==0) 
				{
					Items.get(i).taken=1;
				}
				else 
				{
					Items.get(i).taken=0;
				}
			}
		}
	}
	public void  selection(ArrayList<Solution> sol)
	{
		Random rand= new Random();
		int upperbound = 4;
		//int int_random = rand.nextInt(upperbound);
	
		for(int i = 0 ; i < sol.size();i++)
		{
			for(int j = i+1 ; j< sol.size();j++) 
			{ 
				if(sol.get(i).fitness < sol.get(j).fitness)
					{
					Collections.swap(sol, i, j);
					}
			}
		}
		for(int i =0;i<sol.size();i++) 
		{
			for(int j=0;j<sol.get(0).q.size();j++) 
			{
				System.out.print(sol.get(i).q.get(j).taken);
			}
			System.out.println(sol.get(i).fitness);
		}
		System.out.println("Hopaa");
		int int_random = rand.nextInt(upperbound);
		int int_random2 = rand.nextInt(upperbound);
		//if 
		//Item [] array =  sol.get(int_random2).q.toArray(new Item[sol.get(int_random2).q.size()]);
		//Item [] array2 = sol.get(int_random).q.toArray(new Item[sol.get(int_random).q.size()]);
		//crossover(array,array2,2);
		crossover(sol.get(0).q,sol.get(1).q);
		/*for(int i=0;i<sol.size();i++) 
		{
			Mutation(sol.get(i).q);
		}
		//return sol;
		
		/*for(int i = 0 ; i < 2;i++)
		{
			int int_random = rand.nextInt(upperbound);
		}*/
	}

}
