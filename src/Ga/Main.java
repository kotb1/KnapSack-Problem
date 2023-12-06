package Ga;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		Random rand = new Random();
		Functions ex = new Functions();
		int upperbound = 100;
		System.out.println("Please Enter Number of Test Cases");
		int N_TC= Integer.parseInt(in.nextLine());
		System.out.println("Please Enter number of Items");
		int N_Items=Integer.parseInt(in.nextLine());
		System.out.println("Please Enter The Size of Knapsack");
		int size=Integer.parseInt(in.nextLine());
		ArrayList <Solution> Solutions = new ArrayList <Solution>();
		ArrayList<Item> Items= new ArrayList<Item>();
		for(int p=0;p<N_Items;p++) 
		{
			Item h = new Item();
			System.out.println("Please Enter the weight of the item");
			h.weight=Integer.parseInt(in.nextLine());
			System.out.println("Please Enter the value of the item");
			h.value=Integer.parseInt(in.nextLine());
			Items.add(h);
		}
		//for(int m=0;m<N_TC;m++) {
		for(int j=0;j<12;j++) 
		{
			Solution s = new Solution();
			ArrayList<Item> Items2= new ArrayList<Item>();
			for(int i=0;i<Items.size();i++) 
			{
				Item k = new Item();
				int taken2 =Items.get(i).taken;
				int weight2 =Items.get(i).weight;
				int value2 =Items.get(i).value;
				k.taken=taken2;
				k.weight=weight2;
				k.value=value2;
				Items2.add(k);
			}
			s.q=Items2;
			Solutions.add(s);
		}
		for(int i =0;i<12;i++) 
		{
			for(int j=0;j<N_Items;j++) 
			{
				int int_random = rand.nextInt(upperbound);
				if(int_random<50) 
				{
					Solutions.get(i).q.get(j).taken=1;
				}
				else 
				{
					Solutions.get(i).q.get(j).taken=0;
				}	
			}
		}
		for(int i =0;i<12;i++) 
		{
			for(int j=0;j<N_Items;j++) 
			{
				System.out.print(Solutions.get(i).q.get(j).taken);
			}
			System.out.println();
		}
		for(int m=0;m<N_TC;m++) {
		System.out.println("5lst");
		ex.Feasible(Solutions, size);
		/*for(int i =0;i<Solutions.size();i++) 
		{
			for(int j=0;j<N_Items;j++) 
			{
				System.out.print(Solutions.get(i).q.get(j).taken);
			}
			//System.out.println(Solutions.get(i).fitness);
			System.out.println();
		}*/
		//System.out.println("5lst2");
		ex.Fitness_Evaluation(Solutions);
		for(int i =0;i<Solutions.size();i++) 
		{
			for(int j=0;j<N_Items;j++) 
			{
				System.out.print(Solutions.get(i).q.get(j).taken);
			}
			System.out.println(Solutions.get(i).fitness);
		}
		System.out.println("T3ala");
		ex.selection(Solutions);
		for(int i =0;i<Solutions.size();i++) 
		{
			for(int j=0;j<N_Items;j++) 
			{
				System.out.print(Solutions.get(i).q.get(j).taken);
			}
			System.out.println(Solutions.get(i).fitness);
		}
	}
	ex.Feasible(Solutions, size);
	System.out.println("The Best Solution is: ");
	for(int i=0;i<N_Items;i++) 
	{
		if(Solutions.get(0).q.get(i).taken==1) 
		{
			System.out.print("We will take the item with ");
			System.out.print("Weight: "+Solutions.get(0).q.get(i).weight+"	");
			System.out.print("and with Value: "+Solutions.get(0).q.get(i).value);
			System.out.println();
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(int i =0;i<12;i++) 
		{
			for(int j=0;j<N_Items;j++) 
			{
				System.out.print(Solutions.get(i).q.get(j).taken);
			}
			System.out.println();
		}*/
		/*Item [] array =  Solutions.get(1).q.toArray(new Item[Solutions.size()]);
		for(int i =0;i<array.length-1;i++) 
		{
			System.out.print(array[i].taken);
		}*/
		
		
		
		
		
		
		
		
		/*int int_random = rand.nextInt(upperbound);
		if(int_random<50) 
		{
			Solutions.get(0).q.get(0).taken=1;
			Solutions.get(0).q.get(1).taken=1;
			Solutions.get(0).q.get(2).taken=1;
		} 
		else 
		{
			Solutions.get(0).q.get(0).taken=0;
			Solutions.get(0).q.get(1).taken=0;
			Solutions.get(0).q.get(2).taken=0;
		}
		/*for(int l=0;l<12;l++) 
		{
			
		}*/
		/*System.out.println(Items);
		ArrayList<Item> Items2= new ArrayList<Item>();
		for(int i=0;i<Items.size();i++) 
		{
			Item k = new Item();
			int taken2 =Items.get(i).taken;
			int weight2 =Items.get(i).weight;
			int value2 =Items.get(i).value;
			k.taken=taken2;
			k.weight=weight2;
			k.value=value2;
			Items2.add(k);
		}
		Items2.get(1).taken=20;
		System.out.println(Items.get(1).taken);
		System.out.println(Items2);
		System.out.println(Solutions.get(0).q);
		System.out.println(Solutions.get(1).q);
		System.out.println(Solutions.get(2).q);
		System.out.println(Solutions.get(0).q.get(0).taken);
		System.out.println(Solutions.get(0).q.get(1).taken);
		System.out.println(Solutions.get(0).q.get(2).taken);
		System.out.println(Solutions.get(1).q.get(0).taken);
		System.out.println(Solutions.get(1).q.get(1).taken);
		System.out.println(Solutions.get(1).q.get(2).taken);
		//System.out.println("");
		/*ArrayList<ArrayList<Item>> c = new ArrayList<ArrayList<Item>>();
		//Item [][] arr2 = new Item [10][N_Items];
		ArrayList<Item> arr= new ArrayList<Item>();
		for(int p=0;p<N_Items;p++) 
		{
			Item h = new Item();
			System.out.println("Please Enter the weight of the item");
			h.weight=Integer.parseInt(in.nextLine());
			System.out.println("Please Enter the value of the item");
			h.value=Integer.parseInt(in.nextLine());
			arr.add(h);
		}
		ArrayList <Item> b=new ArrayList<Item>();
		for(int i=0;i<10;i++) 
		{
			for(int j=0;j<N_Items;j++) 
			{
				Item k = new Item();
				int int_random = rand.nextInt(upperbound);
				if(int_random<50) 
				{
					k.taken=0;
				} 
				else 
				{
					k.taken=1;
				}
				b.add(k);
			}
			c.add(b);
		}
		System.out.println(c);
		
		/*for(int q =0;q<10;q++) 
		{
			for(int t =0;t<N_Items;t++) 
			{
				//System.out.print(c.get(i).get(j).taken+"("+c.get(i).get(j).weight+")"+"("+c.get(i).get(j).value+")");
				//System.out.print(c.get(q).get(t).taken);
				System.out.print(c.get(q));
			}
			//System.out.print("	"+c.get(i).get(i).weight+"	"+c.get(i).get(i).value);
			System.out.println();
		}*/
		
		
		
		/*for(int k=0;k<N_Items;k++) 
		{
			System.out.println(arr.get(k).weight+"	"+arr.get(k).value+"	"+arr.get(k).taken);
		}
		for(int j=0;j<10;j++) {
			//ArrayList <Item> k= new ArrayList<Item>();
			for(int i =0;i<N_Items;i++) 
			{
				Item f = new Item();
				f=arr.get(i);
				System.out.println(arr.get(i).value);
				//System.out.println("Please Enter the weight of the item");
				//f.weight=Integer.parseInt(in.nextLine());
				//System.out.println("Please Enter the value of the item");
				//f.value=Integer.parseInt(in.nextLine());
				int int_random = rand.nextInt(upperbound);
				//System.out.println(int_random);
				if(int_random<50) 
				{
					f.taken=0;
				} 
				else 
				{
					f.taken=1;
				}
				System.out.println(f.weight);
				//f.taken=int_random;
				//arr.set(i, f);
				arr.add(i, f);
				System.out.println(arr.get(i).weight);
				//k.add(f);
				//c[j][i].add(f);
				//c.get(i).set(i, f);
			}
			//c.add(k);
			c.add(arr);
		}
		for(int q =0;q<10;q++) 
		{
			for(int t =0;t<N_Items;t++) 
			{
				//System.out.print(c.get(i).get(j).taken+"("+c.get(i).get(j).weight+")"+"("+c.get(i).get(j).value+")");
				System.out.print(c.get(q).get(t).taken);
			}
			//System.out.print("	"+c.get(i).get(i).weight+"	"+c.get(i).get(i).value);
			System.out.println();
		}
		/*for(int i=0;i<10;i++) 
		{
			//int []arr3 = new int[N_Items];
			for(int j=0;j<N_Items;j++) 
			{
				int int_random = rand.nextInt(upperbound);
				arr2[i][j].taken=int_random;
			}
			/*String s="";
			for (Item x : arr2[i]) {
			    s += x .toString();
			}
			//Integer finalResult = Integer.parseInt(s);
			//arr2[i]=finalResult;
			arr2[i]=s;*/
		//}
		/*for(int i =0;i<arr2.length;i++) 
		{
			for(int j=0;j<N_Items;j++) 
			{
				System.out.print(arr2[0][j].taken);
			}
			System.out.println();
		}*/
		
		//int int_random = rand.nextInt(upperbound);
		/*for(int i = 0; i<N_Items; i++)
		{
		    for(int j = 0; j<2; j++)
		    {
		        System.out.print(arr[i][j]);
		    }
		    System.out.println();
		}*/
		

	}

}
