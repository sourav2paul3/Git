package com.SouravPaul;

import java.util.*;
public class Gifts{
	private String type;
	public void set_type(String x)
		{
		if(x.equalsIgnoreCase("Chocolate"))
			type="Chcoclate";
		if(x.equalsIgnoreCase("Sweet"))
			type="Sweet";
		if(x.equalsIgnoreCase("Other"))
			type="Other";
		}
	public String show_type()
		{
		return type;
		}
	public Gifts()
		{type="None";
		}
	public Gifts(Gifts gifts)
		{
		type=gifts.type;
		}
	public Gifts(String type)
		{
		this.type=type;
		}
	}
class Newyear_gfts extends Gifts
	{
		private static int choc=0;
		private static int sweet=0;
		private static int others=0;
		private static int total=0;
		static int total_weight()
			{return total;
			}
		static int total_choc()
			{
			return choc;
			}
		static int total_sweet()
			{
			return sweet;
			}
		static int total_others()
			{
			return others;
			}
		static void count(Gifts gifts)
			{if(gifts.show_type()!="None")
				{
					total++;
				if(gifts.show_type().equalsIgnoreCase("Chocolate"))
					choc++;
				if(gifts.show_type().equalsIgnoreCase("Sweet"))
					sweet++;
				if(gifts.show_type().equalsIgnoreCase("Other"))
					others++;
				}
			}
			
		public static void main(String args[])
			{
			Gifts gifts[]=new Gifts[100];
			Scanner sc=new Scanner(System.in);
			int choice;
			String typ;
			int lastgft=-1;
			do {
			System.out.println("\nEnter 1 for new gift");
			System.out.println("Enter 2 for total gift weight");
			System.out.println("Enter 3 for total Chcocolate weight");
			System.out.println("Enter 4 for total Sweet weight");
			System.out.println("Enter 5 for others weight");
			System.out.println("Enter 0 for exit");
			System.out.print("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
				{case 1:System.out.print("Enter the type of gift(Chocolate/Sweet/Other):");
						sc.nextLine();
						typ=sc.nextLine();
						Gifts temp=new Gifts(typ);
						count(temp);
						gifts[++lastgft]=temp;
						break;
				case 2: System.out.println("Total Gifts:"+total_weight());
						break;
				case 3:System.out.println("Total Chcolates are:"+total_choc());
						break;
				case 4:System.out.println("Total Sweets are:"+total_sweet());
						break;
				case 5:System.out.println("Others are:"+total_others());
						break;
				case 0:System.out.println("The End");
						break;
				default:System.out.println("Invalid choice");
				}
			}while(choice!=0);
			}
		}